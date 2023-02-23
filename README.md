# To run the app in intellij, use "add VM options" in configuration and pass the below arguments
-Djasypt.encryptor.password=viyahitha

# To encrypt all the properties in properties file which are like ENC()
mvn jasypt:encrypt -Djasypt.encryptor.password=viyahitha

# To encrypt a single property in command line 
mvn jasypt:encrypt-value -Djasypt.encryptor.password=viyahitha -Djasypt.plugin.value=some-password

# To decrypt a single property in command line
mvn jasypt:decrypt-value -Djasypt.encryptor.password=viyahitha -Djasypt.plugin.value=encrypted-value

# To encrypt all the properties in yml file which are like ENC()
mvn jasypt:encrypt -Djasypt.encryptor.password=viyahitha -Djasypt.plugin.path="file:src/main/resources/application.yml" 

