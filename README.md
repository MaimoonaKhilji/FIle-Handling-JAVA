# FIle-Handling-JAVA
A complete java Code for file handling.


**File Handling in Java**
<pre>
  File handling implies how to read from and write to file in java. Java provides the 
  basic I/O package for reading and writing streams. Java.io.package allows to do all Input and Output tasks in java.
</pre>

**Stream**
<pre>
A stream can be defined as a sequence of data. 
There are two kinds of Streams:
        InPutStream − The InputStream is used to read data from a source.
        OutPutStream − The OutputStream is used for writing data to a destination.
</pre>                                   

**Stream Classes**
<pre>
The basic stream classes in java are: 
        Character stream classes 
        Byte stream classes 
        Standard stream classes
</pre>

**java.io.File**
<pre>
  Class java.io.File represents a file or folder (directory). 
  
**Constructors: **

  There are two constructors:
        public File (String path)
        public File (String path, String name) 
</pre>


**Character stream classes **
<pre>

Character Stream is a stream which incorporates with characters.
Processing of input data with character is called the file handling process with a character stream. 

The most frequently used character stream classes are:
        FileReader 
        FileWriter
</pre>

**What is e printStackTrace () in Java?**
<pre>
  The printStackTrace() method in Java is a tool used to handle exceptions and errors. 
It is a method of Java's throwable class which prints the throwable along with other 
details like the line number and class name where the exception occurred.

</pre>


**Byte stream classes**
<pre>
  This mainly incorporates with byte data. When an input is provided and 
executed with byte data, then it is called the file handling process with a byte stream.

The most frequently used byte stream classes are:
       FileInputStream
       FileOutputStream.
</pre>


**Java FileOutputStream class**
<pre>
  The Java.io.FileOutputStream class is an output stream for writing data to a File or to a FileDescriptor. 

Following are the important points about FileOutputStream :

      This class is meant for writing streams of raw bytes such as image data.
      For writing streams of characters, use FileWriter.
</pre>

**Java FileInputStream class**
<pre>

  class obtains input bytes from a file. It is used for reading byte-oriented data (streams of raw bytes) 
such as image data, audio, video etc. You can also read character-stream data.
</pre>



**Standard Streams**
<pre>
  Java provides following three standard streams:

Standard Input: This is used to feed the data to user's program and usually a keyboard is 
                    used as standard input stream and represented as System.in. 
                    
                    System.in:      This is the standard input stream that is used to read 
                                      characters from the keyboard or any other standard input device.
                                      
                                      
Standard Output: This is used to output the data produced by the user's program and usually 
                      a computer screen is used to standard output stream and represented as System.out. 
                      
                      System.out : This is the standard output stream that is used to produce the 
                                        result of a program on an output device like the computer screen.
                                        
                                        
Standard Error: This is used to output the error data produced by the user's program and usually 
                    a computer screen is used to standard error stream and represented as System.err.
                     
                    System.err: This is the standard error stream that is used to output all the 
                                    error data that a program might throw, on a computer screen or any 
                                    standard output device.
</pre>

