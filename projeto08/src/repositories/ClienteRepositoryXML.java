package repositories;

import entities.Cliente;
import interfaces.IClienteRepository;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class ClienteRepositoryXML implements IClienteRepository {

    @Override
    public void exportar(Cliente cliente) throws Exception {
        // abrindo o documento XML
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        // criando a tag raiz do XML <CLIENTE>
        Element root = document.createElement("CLIENTE");

        document.appendChild(root);
        // criando as subtags com os dados do cliente
        Element idCliente = document.createElement("IDCLIENTE");
        idCliente.setTextContent(cliente.getIdCliente().toString());
        root.appendChild(idCliente);
        Element nome = document.createElement("NOME");
        nome.setTextContent(cliente.getNome());
        root.appendChild(nome);
        Element email = document.createElement("EMAIL");
        email.setTextContent(cliente.getEmail());
        root.appendChild(email);
        Element cpf = document.createElement("CPF");
        cpf.setTextContent(cliente.getCpf());
        root.appendChild(cpf);

        // finalizando o documento XML..
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);
        // gravando em arquivo
        StreamResult stream = new StreamResult(new File("c:\\temp\\cliente.xml"));
        transformer.transform(domSource, stream);
    }
}
