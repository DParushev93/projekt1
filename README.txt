Die Anwendung kann mit "mvn install" gebaut werden. 
Die erstellte war Datei befindet sich danach unter "quackr-server/target" 
und kann mit dem Befehl "java -jar quackr-server-0.0.1-SNAPSHOT.war" gestartet werden. 
Da die Anwendung auch eine Verbindung zu einem PostgreSQL Datenbank braucht, 
kann die App auch mit einem in-memory Datenank gestartet werden. 
Die in-memory Datenbank ist in dem Datei "quackr-server/src/main/resources/application.properties" schon vorkonfiguriert.
Nach dem Starten der Anwendung, können Sie die Weboberfläche unter localhost:8080 
in ihrem browser erreichen.
Die Anwendung kann nur unter JDK 8 gebaut werden. Die erstellte war Datei ist aber
auch unter OpenJDK 11 und OracleJDK 12 lauffähig.
