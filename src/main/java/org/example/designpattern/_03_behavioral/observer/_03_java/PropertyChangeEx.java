package org.example.designpattern._03_behavioral.observer._03_java;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeEx {
    static class Ussr implements PropertyChangeListener {
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            System.out.println(evt.getNewValue());
        }
    }

    static class Subject {
        PropertyChangeSupport support = new PropertyChangeSupport(this);

        public void addObserver(PropertyChangeListener listener) {
            support.addPropertyChangeListener(listener);
        }

        public void removeObserver(PropertyChangeListener listener) {
            support.removePropertyChangeListener(listener);
        }

        public void add(String message) {
            support.firePropertyChange("message", null, message);
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        Ussr user = new Ussr();

        subject.addObserver(user);
        subject.add("Hello");
        subject.removeObserver(user);
        subject.add("Hello");
    }
}
