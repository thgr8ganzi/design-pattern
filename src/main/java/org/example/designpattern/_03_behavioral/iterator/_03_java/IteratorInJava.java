package org.example.designpattern._03_behavioral.iterator._03_java;

import org.example.designpattern._03_behavioral.iterator._02_after.Board;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorInJava {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        Enumeration enumeration;
        Iterator iterator;

        Board board = new Board();
        board.addPost("Post 1");
        board.addPost("Post 2");
        board.addPost("Post 3");

        board.getPosts().iterator().forEachRemaining(post -> System.out.println(post.getTitle()));

        // TODO StAX(Streaming API for XML)
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream("Book.xml"));

        while (reader.hasNext()) {
            XMLEvent nextEvent = reader.nextEvent();
            if (nextEvent.isStartElement()) {
                StartElement startElement = nextEvent.asStartElement();
                QName name = startElement.getName();
                if (name.getLocalPart().equals("book")) {
                    Attribute title = startElement.getAttributeByName(new QName("title"));
                    System.out.println(title.getValue());
                }
            }
        }
    }
}
