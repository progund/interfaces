#################### USAGE #############################
#
# make run - compiles and executes the test program
# make clean  - removes your class files
# make - builds/compiles your Java files
#
########################################################



JAVA_FILES=   \
  ./net/sortex/books/Book.java                \
  ./net/sortex/books/BookYearComparator.java   \
  ./net/sortex/books/test/BookTest.java 


JAVA_CLASSES=$(JAVA_FILES:.java=.class)

TEST_MAIN=net.sortex.books.test.BookTest


CLASSPATH=.

all: test

%.class:%.java
	javac -cp $(CLASSPATH) $<


test: $(JAVA_CLASSES)

clean:
	find . -name "*.class" | xargs rm -f
	find . -name "*~" | xargs rm -f

classes:
	@echo "List of existing classes:"
	find . -name "*.class" 
	@echo "List of classes defined in the Makefile:"
	@echo $(JAVA_CLASSES)

run: $(JAVA_CLASSES)
	java -cp $(CLASSPATH) $(TEST_MAIN) "."


