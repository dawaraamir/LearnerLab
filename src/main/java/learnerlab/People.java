package learnerlab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class  People <E extends Person> implements Iterable <E>{
    List<Person> personList = new ArrayList<>();
    private ArrayList<E> eList;

//    public void add(ArrayList<Person> personList, Person person) {
//        this.personList = personList;
//        personList.add(person);
//    }
public People(ArrayList<E> eList){
    this.eList = eList;
}
    public People(){
        this.eList = new ArrayList<E>();
    }

    public void add(E e) {
        this.eList.add(e);
    }

//    public Person findByID(long id) {
//        for (Person person : personList) {
//            if (person.getId() == id) {
//                return person;
//            }
//        }
//        return null;
//    }
public E findById(long id) {
    for(E e : this.eList){
        if(e.getId() == id) {
            return e;
        }
    }  return null;
}

//    public boolean contains(Person person) {
//        if (personList == person) {
//            return true;
//        }
//        return false;
//    }
public boolean contains(E e) {
    return this.eList.contains(e);
}

//    public void remove(Person person) {
//        if (personList.contains(person)) {
//            personList.remove(person);
//        }
//    }
public void remove(E e) {
    this.eList.remove(e);
}
//
   public void remove(long id) {
//        for (Person person : personList) {
//            if (person.getId() == id) {
//                personList.remove(person);
//            }
//        }
//    }
    E eToBeFound = this.findById(id);
         if(eToBeFound != null) {
        this.remove(eToBeFound);
    }
}

    public void removeAll() {
        //personList.clear();
        this.eList.clear();
    }

    public int Count() {
        //return personList.size();
        return this.eList.size();
    }

//    public Object[] toArray() {
//        return personList.toArray();
    // }
        abstract E[] toArray();


//    public Iterator iterator() {
//        Iterator<Person> i = personList.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next() + " ");
//        }
//        return null;
//    }

    public Iterator<E> iterator() {
        return this.eList.iterator();
    }
}
