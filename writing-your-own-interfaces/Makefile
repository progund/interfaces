#################### USAGE #############################
#
# make run - compiles and executes the text program
# make clean  - removes your class files
# make - builds/compiles your Java files
#
########################################################



JAVA_FILES=   ./com/superpower/filebrowser/utils/FileList.java  \
              ./com/superpower/filebrowser/FBFile.java           \
	      ./com/superpower/filebrowser/FBDir.java               \
              ./com/superpower/filebrowser/FBJavaFile.java           \

#              ./com/superpower/filebrowser/FBMp3.java             \
#              ./com/superpower/filebrowser/FBOgg.java              \
#              ./com/superpower/filebrowser/main/TextFileBrowser.java  \
#              ./com/superpower/filebrowser/main/MediaPlayer.java

JAVA_CLASSES=$(JAVA_FILES:.java=.class)

BROWSER_MAIN=com.superpower.filebrowser.main.TextMain
MEDIAPLAYER_MAIN=com.superpower.filebrowser.main.MediaPlayer

CLASSPATH=.

all: text

%.class:%.java
	javac -cp $(CLASSPATH) $<


text: $(JAVA_CLASSES)

clean:
	find . -name "*.class" | xargs rm -f
	find . -name "*~" | xargs rm -f

classes:
	@echo "List of existing classes:"
	find . -name "*.class" 
	@echo "List of classes defined in the Makefile:"
	@echo $(JAVA_CLASSES)

browser: $(JAVA_CLASSES)
	cd files && java -cp ..:$(CLASSPATH) $(BROWSER_MAIN)
	java -cp $(CLASSPATH) $(BROWSER_MAIN) "."
	java -cp $(CLASSPATH) $(BROWSER_MAIN) "files"

player: $(JAVA_CLASSES)
	java -cp $(CLASSPATH) $(MEDIAPLAYER_MAIN) "files"


run: browser player
