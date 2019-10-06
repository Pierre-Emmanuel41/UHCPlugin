package fr.pederobien.uhc.conf.persistence;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import fr.pederobien.uhc.conf.configurations.BlockedexConfiguration;

public class BlockedexPersistence extends AbstractConfPersistence<BlockedexConfiguration> {
	private static final String BLOCKEDEX_GAME = GAME + "/BlockedexGame/";
	private static final double CURRENT_VERSION = 1.0;

	public BlockedexPersistence() {
		super(BlockedexConfiguration.DEFAULT);
		checkAndWriteDefault(BLOCKEDEX_GAME, get());
	}

	@Override
	public void load(String name) throws FileNotFoundException {
		try {
			Document doc = getDocument(BLOCKEDEX_GAME + name + ".xml");
			Element root = doc.getDocumentElement();

			Node version = root.getElementsByTagName("version").item(0);

			switch (version.getChildNodes().item(0).getNodeValue()) {
			case "1.0":
				load10(root);
				break;
			default:
				break;
			}
		} catch (IOException e) {
			throw new FileNotFoundException("Cannot find blockedex game style named " + name);
		}
	}

	@Override
	public void save() {
		Document doc = newDocument();
		doc.setXmlStandalone(true);
		Element root = doc.createElement("configuration");
		doc.appendChild(root);

		Element version = doc.createElement("version");
		version.appendChild(doc.createTextNode("" + CURRENT_VERSION));
		root.appendChild(version);

		Element name = doc.createElement("name");
		name.appendChild(doc.createTextNode(configuration.getName()));
		root.appendChild(name);
		
		saveDocument(BLOCKEDEX_GAME + configuration.getName() + ".xml", doc);
	}

	@Override
	public List<String> list() {
		return getList(BLOCKEDEX_GAME);
	}
	
	private void load10(Element root) {
		for (int i = 0; i < root.getChildNodes().getLength(); i++) {
			if (root.getChildNodes().item(i).getNodeType() != Node.ELEMENT_NODE)
				continue;
			Element elt = (Element) root.getChildNodes().item(i);

			switch (elt.getNodeName()) {
			case "name":
				configuration = new BlockedexConfiguration(elt.getChildNodes().item(0).getNodeValue());
				break;
			default:
				break;
			}
		}
	}
}