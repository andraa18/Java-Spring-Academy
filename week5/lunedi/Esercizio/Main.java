package lunedi.Esercizio;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    private static int currentId = 1;

    public static void toXML(Person personIn, String fileName, Person person2) {
        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            Element root = document.createElement("Persons");
            document.appendChild(root);

            Element person = document.createElement("Person");
            root.appendChild(person);

            person.setAttribute("id", String.valueOf(currentId));
            currentId++;

            Element name = document.createElement("name");
            name.appendChild(document.createTextNode(personIn.getName()));
            person.appendChild(name);

            Element age = document.createElement("age");
            name.appendChild(document.createTextNode(String.valueOf(personIn.getAge())));
            person.appendChild(age);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);

            StreamResult streamResult = new StreamResult(new File(fileName + ".xml"));
            transformer.transform(domSource, streamResult);

            System.out.println("File XML creato con successo!");

            document.getDocumentElement().normalize();
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.println("Inserire il nome:");
            String name = scannerS.nextLine();
            System.out.println("Inserire l'età:");
            int age = scannerN.nextInt();
            Person person = new Person(name, age);
            System.out.println(person.getInfo());
            System.out.println("Vuoi salvare le informazini in un file XML?");
            if (scannerS.nextLine().trim().equals("si")) {
                System.out.println("Inserisci il nome del file in cui vuoi salvare le tue info:");
                String fileName = scannerS.nextLine();
                toXML(person, fileName, person);
            }

            Method method = person.getClass().getMethod("getAge");
            if (method.isAnnotationPresent(DeprecatedCustom.class)) {
                DeprecatedCustom deprecatedCustom = method.getAnnotation(DeprecatedCustom.class);
                if (deprecatedCustom.deprecated()) {
                    System.out.println("Metodo deprecato");
                }
            }

            System.out.println("Vuoi introdure un'altra persona?");
            if (scannerS.nextLine().trim().equals("no")) {
                continua = false;
            }
        }
        scannerS.close();
        scannerN.close();
    }
}