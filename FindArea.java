cd C:\Users\dilus\OneDrive\Documents\NetBeansProjects\FindArea; "JAVA_HOME=C:\\Program Files\\Java\\jdk1.8.0_361" cmd /c "\"C:\\Program Files\\NetBeans-17\\netbeans\\java\\maven\\bin\\mvn.cmd\" -Dexec.vmArgs= \"-Dexec.args=${exec.vmArgs} -classpath %classpath ${exec.mainClass} ${exec.appArgs}\" -Dexec.appArgs= -Dexec.mainClass=com.nsbm.findarea.FindArea \"-Dexec.executable=C:\\Program Files\\Java\\jdk1.8.0_361\\bin\\java.exe\" \"-Dmaven.ext.class.path=C:\\Program Files\\NetBeans-17\\netbeans\\java\\maven-nblib\\netbeans-eventspy.jar\" -Dfile.encoding=UTF-8 --no-transfer-progress org.codehaus.mojo:exec-maven-plugin:3.1.0:exec"
Running NetBeans Compile On Save execution. Phase execution is skipped and output directories of dependency projects (with Compile on Save turned on) will be used instead of their jar artifacts.
Scanning for projects...

-------------------------< com.nsbm:FindArea >--------------------------
Building FindArea 1.0-SNAPSHOT
--------------------------------[ jar ]---------------------------------

--- exec-maven-plugin:3.1.0:exec (default-cli) @ FindArea ---
Circle Area:78.5
Circle Parimeter:31.400000000000002
Rectangle Area:40.0
Rectangle Parimeter:26.0
Triangle Area:5.0
Triangle Parimeter:15.0
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  0.629 s
Finished at: 2023-06-22T20:24:27+05:30
------------------------------------------------------------------------
