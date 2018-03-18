package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("Library of annuals");
        for (int n = 0; n < 5; n++) {
            library.getBooks().add(new Book ("Title #" + n, "Author #" + n, LocalDate.of(1990 + n, 1, 1)));
        }

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library of annuals 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);

       Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library of annuals 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().clear();
        int i = library.getBooks().size();
        // int t = clonedLibrary.getBooks().size();
        int d = deepClonedLibrary.getBooks().size();

        //then
        Assert.assertEquals(0, i);
        System.out.println(library.getName() + ":\n" + library.getBooks() + "\n" + "Size of library \"" + library.getName() + "\": " + library.getBooks().size() + "\n");
        // Assert.assertEquals(5, t);
        // System.out.println(clonedLibrary.getName() + ":\n" + clonedLibrary.getBooks() + "\n" + "Size of library \"" + clonedLibrary.getName() + "\": " + clonedLibrary.getBooks().size() + "\n");
        Assert.assertEquals(5, d);
        System.out.println(deepClonedLibrary.getName() + ":\n" + deepClonedLibrary.getBooks() + "\n" + "Size of library \"" + deepClonedLibrary.getName() + "\": " + deepClonedLibrary.getBooks().size() + "\n");
    }
}





//    Zmodyfikuj klasę Library tak,
//    aby była zgodna ze wzorcem Prototype
//
//    Zmodyfikuj test testGetBooks()
//    w taki sposób, aby prezentował
//    działanie shallowCopy()oraz deepCopy().
