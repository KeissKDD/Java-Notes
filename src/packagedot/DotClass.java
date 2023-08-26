//============================================================================= 
// PROGRAMMER: Keiss De Los Santos  
// PANTHER ID: 6183670
//
// CLASS: COP2210  
// SECTION: U01
// SEMESTER: Spring 2020 
// CLASSTIME: T/TH 2:00-3:15 pm 
// 
// Project: Put what this project is: example Lab 5 or Project 1 
// DUE: Month Date, 2020
// 
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my
//                own and that none of it is the work of any other person.
//=============================================================================

package packagedot;

import inputPackage.GetData;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/*
    Project Name: Project_Name

    ☑ Create Main Class: packagedot.DotClass
*/

/*
    How to read UML --------------------------------------------

    Uniform Modeling Language

    + = Public (Accessed anywhere, including different packages)
    - = Private (Accessed only in its own class)
    ?? = Default (Assessed only in its own class and other classes in the same package)
    ?? = Protected (Assessed only in its own class, other classes in the same package, and subclasses)

    __ = Static (Stays centralized throughout, otherwise, it can be variable for different instances; exists throughout the program)
    <<constructor>> = Constructor ("Builds the main things," contains no void)
    {readOnly} = A constant using a final (a final class would prevent inheritance, a final method would prevent changeable methods)

    Function is the same as method.
    varType: varName = Variable with its type and name (int, double, or String)
    funcName():varType = (Getter) Function name, with a return variable type
    funcName(varName: varType): void = (Setter) Function name, with variable type and name, and a void status

    
    String Methods ---------------------------------------------
    
    string1.equals(string2) = returns a boolean (true/false) for if the two strings are equal
                              cannot use == for strings
    string1.equalsIgnoreCase(string2) = same as above, but ignores differences in capitalisation
    string1.compareTo(string2) = returns a number based on the strings index size and alphabetical order
                                 (- for if string1 is less than string 2,
                                  + for if string1 is greater than string 2,
                                  0 for when both strings are equal)
    Character.isLetter(c) = returns a boolean for if the character is alphabetical (a letter)
    Character.isDigit(c) = returns a boolean for if the character is a digit
    Character.isWhitespace(c) = returns a boolean for if the character is a whitespace (' ', '\n')
    Character.UpperCase(c) = returns the string (c) as its uppercase version (if it has one)
    Character.LowerCase(c) = returns the string (c) as its lowercase version (if it has one)
    
    string.toUpperCase() = returns the string to all uppercase
    string.toLowerCase() = returns the string to all lowercase
    string.indexOf(item) = returns number of the first index where the item occurred
                           returns -1 if the item never occurred
    string.indexOf(item, index) = same as above, but starts at the inputted index
    string.lastIndexOf(item) = same as above, but for the last index the item occurred
    string.substring(index1, index2) = cuts the string, such that it contains only the characters between the inputted indexes (only including start index (index1))
    string.contains(item) = returns boolean if the string contains the item within it
    "\n" = enters a new line within a string (use when using printf instead of println)
    "\t" = enters a tab within a string

    StringBuffer varName = new StringBuffer(string) = creates a String variable that can change or grow (is mutable)
                                                      an int could be used instead of a string to specify character length
                                                      if no string or int is used, 16 characters are the default
    bufferName.length() = returns length of only the string
    bufferName.capacity() = returns length of the entire StringBuffer (total allocated capacity it can store)
    
    bufferName.append(string) = adds string to the ends of the StringBuffer
    bufferName.insert(int, string) = inserts the string at the int index (character at index int is moved forward)
    bufferName.reverse() = reverses the characters of the string
    bufferName.delete(startInt, endInt) = deletes the characters from startInt index to endInt index
                                          deletion includes the startInt index, but not the endInt index
                                          default for both parameters are 0 and length()-1
    bufferName.replace(startInt, endInt, string) = mix of the insert() and delete() methods

    Use the import java.util.StringTokenizer for StringTokenizers

    StringTokenizer varName = new StringTokenizer(string, delimiterString, boolean) = a type of String variable that seperates the string
                                                                                      between the delimiter strings into multiple token strings
                                                                                      default delimiters are \n, space, \t, carriage return, and form feed
                                                                                      if the boolean is true, than the delimiters themselves are included as tokens
                                                                                      if the boolean is false (default boolean), than the delimiters are not included as tokens
    Use the methods below in a while loop when using all tokens of a StringTokenizer
    tokenName.hasMoreTokens() = a true/false operator for checking if the StringTokenizer has more words
    tokenName.nextToken() = a method that sets to and returns the next token
                            the first token could only be used after using this method at least once
    tokenName.nextToken(delimiterString) = a methods that sets to and returns the next token using a new delimiter

    Arrays -----------------------------------------------------

    arrType[] arrName = new arrType [arrSize]; = Creates an array of a type of variable, with a size
    arrType[] arrName = {a,b,c,d}; = Creates an array with values in it
    
    arrType[][] arrName = new arrType [numOfArrays][sizeOfIndividualArrays]; = Formating for 2-D arrays
    arrType[][] arrName = {{a,b,c,d}, {e,f,g,h}}; = Creates an array with values in it for 2-D arrays
    
    arrName.length = Method to find length of array (a row's length) (remember: final index would be length - 1)
    arrName[arrIndex].length = Method to find length of a specific array (a column's length for a row) in a 2-D array

    for(varType placeholderValueName: arrName){} = An enhanced for loop that goes through every value of an array (a for each loop)
                                                   "varType" must match the the array's variables
                                                   "placeholderValueName" holds the current value of the current index

    Array Lists ------------------------------------------------

    ArrayList<type> arrListName = new ArrayList<type>(); = Creates an array list with an object of type and name of name
                                                           Use "Integer" instead of "int" (int is a primative type, not an object type)
                                                           The second "type" in the statement is not necessary
    ArrayList arrListName = new ArrayList(); = Creates an array list with no restrictions on what objects it can hold

    arrListName.get(int) = returns the object at index "int"

    arrListName.add(object) = add an object to the end of an array list, incereasing the size by one
                              (object must match the array list's objects)
    arrListName.add(int, object) = adds a new object an index "int", incereasing the size by one
                                   pushes the replaced value and subsequent values forward one index
    arrListName.get(int) = get object at index "int"
    arrListName.remove(int) = remove object at index "int", decreasing the size by one
                              pulls all subsequent values backwards by one index
    arrListName.clear() = remove all the objects from an array list
    arrListName.size() = returns the number of objects in the array list
                         Do not use .length(), it does not work

    for(Object placeHolderValue: arrListName){} = An enhanced for loop for array lists holding any objects
                                                  Must type "Object" as all objects are of object object
    

    Inputs and Messages ----------------------------------------

    Scanner(System.in) =    Creates a Scanner instance that can read user inputs
    scrName.next() =        Asks the user for a string
    scrName.nextInt() =     Asks the user for an integer
    scrName.nextDouble() =  Asks the user for a double

    Alternate method, use the import javax.swing.JOptionPane (look at class GetData)

    JOptionPane.showInputDialog(message) = A function that asks the user for a string (read showMessageDialog for specifics)
                                           A pop-up window will appear with the message as a prompt
    JOptionPane.showConfirmDialog(message) = A function that asks the user a confirming message (read showMessageDialog for specifics)
                                             Answers include yes/no/cancel
                                             Returns an int (yes = 0, no = 1, cancel = 2)
                                             Types of messages:
                                               JOptionPane.DEFAULT_OPTION, YES_NO_OPTION, YES_NO_CANCEL_OPTION, OK_CANCEL_OPTION
    JOptionPane.showMessageDialog(Component,Object,String,int,Icon) = A function that shows a message (no inputs)
                                                                              Component creates a frame (usually null)
                                                                              Object is the message (can be a String or any other Object)
                                                                              String is the heading
                                                                              MessageType is the type of message(uses final int varables)
                                                                                JOptionPane.INFORMATION_MESSAGE, ERROR_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE
                                                                              Icon is a decorative item for the display

    Use the following functions with the JOptionPane method for number inputs:
    Integer.parseInt(string) = A function that converts a string into an integer
    Double.parseDouble(string) = A function that converts a string into a double

    Use imports javax.swing.JTextArea and javax.swing.JScrollPane to create a scrollable window with a display

    JTextArea varName = new JTextArea(string, y, x) = creates a rectangle containing text with height y and length x (x scales less than y)
    JScrollPane varName = new JScrollPane(Object?) = creates a scrollable pane to display the object
    
    JOptionPane.showMessageDialog(Component, JScrollPaneVarName, Heading, MessageType) = creates the window to display a message

    Files ------------------------------------------------------

    Use the import java.io.File for File objects

    File(String directoryPath) = creates a File object
                                 Parent only
                                 "C:\\answer\\Ceasar.java"
                                 "answer/Ceasar.java"
    File(String directoryPath, String fileName) = creates a File object specifiying path and name
                                                  Parent and Child
                                                  "C:\\answer", "Ceasar.java
                                                  "answer", "Ceasar.java"
    File(Object file, String filename) = creates a File object from an abstract path
                                         use when File/parent directory already  exists
                                         answer, "Ceasar.java"

    fileNameVar.
    .exists() =         returns a boolean for if the file actually exists
    .isDirectory() =    returns a boolean for if the object is a directory
    .isFile() =         returns a boolean for if the object is a file
    .isAbsolute() =     returns a boolean for if the file object refers to an absolute path name
    .canRead() =    returns boolean for if the file object allows it to be read
    .canWrite() =   returns boolean for if the file object allows it to be written
    .equals() =     returns boolean for if two file objects equal each other

    .getName() =            returns string of the file name
    .getPath() =            returns string of the path of the file
    .getAbsolutePath() =    returns string of the absolute path of the file
    .getParent() =          returns string of parent directory of the file
    .length() =     returns a long for the length of the file
    .toString() =   returns string representatoin of the file
    .list() =       returns a string array of the files in the directory named by the file
    
    .delete() = deletes the file (boolean?)
                if a directory is to be deleted, it must be emptied first
    .mkdir() =  creates a directory with the pathname of the file (boolean?)
    .mkdir() =  same as above, but including any necessary parent directories
                 returns true if all directories are made
    .renameTo(File) =   renames the file (boolean?)
    
    
    Use java.swing.JFileChooser and JOptionPane

    .showOpenDialog(null) = provides a selectable imput
    .getSelectedFile() = returns the name of the selected file


    Input Stream -----------------------------------------------

    IO Classes ending with Stream (____Stream) use byte oriented streams

    Use the import java.io.____

    File --> FileInputStream --> InputStreamReader --> BufferInputStream --> DataInputStream

    .read throws IOException = reads the next byte of data from the input stream
                               returns int representation of byte
    .read(byte[]) throws IOException =                      reads multiple bytes and stores them into an byte array
    .read(byte[], int off, int len) throws IOException =    same as above, but starts reading at "off" and only reads "lens" bytes

    .mark(int) =                    marks the current position of the input stream
    .reset() throws IOException =   repositions the input stream to where the mark(int) method was last called
    .markSupported() =              returns boolean if input stream can mark(int) and reset()
    
    .available() throws IOException =   returns an int estimate of the number of readable/skippable bytes of the input stream
    .skip(long n) throws IOException =  skips and discards n bytes of data from the input stream
    .close() throws IOException =       closes the input stream
    
    Use FileInputStream for files

    FileInputStream(File file) = creates a FileInputStream by opening a connection to a File
    FileInputStream(String file) = same as above, but with the name of the File

    Use DataInputStream

    DataInputStream(FileInputStream) = Creates a DataInputStream

    .available() = returns an int estimate of the number of readable/skippable bytes of the input stream
    
    .readFully(buf) throws IOException = read the full data into buffer (use .available() for the buffer size)
    .readFully(buf, int off, int len) throws IOException = same as above, but starts reading at "off" and only reads "len" bytes
    .read ___() throws IOException = reads the next occurrence of the ___ variable
    
    Use BufferInputStream to read data from an InputStream by using a buffer to optimize reading speed

    BufferInputStream(InputStream in) = creates a BufferInputStream with a buffer of 8KB (8192 bytes)
    BufferInputStream(InputStream in, int size) = creates a BufferInputStream  with a specified buffer

    Output Stream ----------------------------------------------

    IO Classes ending with Stream (____Stream) use byte oriented streams

    File --> FileOutputStream --> BufferedOutputStream  --> DataOutputStream

    .close() throw IOException =    closes the output stream
                                    ALWAYS CLOSE THE OUTPUT STREAMS
    .flush() throw IOException =    flushes the output stream
    .write(byte[] b) throw IOException =                    writes b.length number of bytes from the array to the output stream
    .write(byte[] b, int off, int len) throw IOException =  same as above, but starts writing at "off" and only reads "len" bytes
    .write(int) throw IOException =                         writes the specified byte to the output stream

    
    Use FileOutputStream for files

    FileOutputStream(File file) = creates a FileOutputStream to write to the specified File
                                  creates a file if the file did not exist before
    FileOutputStream(String file) = same as above
    FileOutputStream(File file, boolean tf) = appends to a file object if true
                                              rewrites a file object if false
    FileOutputStream(String file, boolean tf) = same as above

    Use DataOutputStream

    DataOutputStream(FileOutputStream) = creates a DataOutputStream by using the file specified (if it exists) or by creating it

    .write___(___) throws IOException = writes for any variable
    .write(buf, int off, int len) throws IOException = write method with a buffer and starts writing at "off" and up to "len" bytes
    
    .close() = closes the stream, which is nessessary

    Use BufferedOutputStream

    BufferedOutputStream(OutputStream) = creates a BufferedOutput Stream with a default buffer of 8KB (8192 bytes)
    BufferedOutputStream(OutputStream, int size) = same as above, but with a specified buffer size

    Use PrintStream to display info to the screen (System.out.print)

    PrintStream(File) = creates a PrintStream with the file, without automatic line flushing
    PrintStream(File, String charset) = same as above, but with a specified charset
    PrintStream(String) = same as above, but with the file's name
    PrintStream(String, String charset) = same as above, but with the file's name
    PrintStream(OutputStream)
    PrintStream(OutputStream, boolean autoFlush)
    PrintStream(OutputStream, boolean autoFlush, String charset)

    .close() = closes the stream
    .flush() = flushes the stream
    .print(___) = prints any type of variable to a string
                  formats the output
    .println(___) = same as above, but a new line is put after the printed string
    .write(___) = prints a single character, array of characters, and strings
    .write(String, int off, int len) = writes a portion of a string
                                       writes the string starting at "off" and only reads "len" characters

    .setError() = sets the error state of the stream to be true
    .checkError() = flushes the stream and checks its error state
                    returns true if IOException is encountered (excluding InterruptedIOException)
    .clearError() = clears the internal error of the stream
    
    Reader -----------------------------------------------------

    Reader classes uses character oriented streams

    File --> FileReader --> LineNumberReader

    .read() throws IOException = reads the next character of the input stream and returns an int representative
    .read(char[] array) throws IOException = same as above, but stores the ints in the array
    .read(char[] array, int i, int f) throws IOException = (abstract) same as above, but reads within a range of characters
    .read(CharBuffer) = same as above, but uses a character buffer

    .mark(int limit) = returns int of the current position of the input stream
    .markSupport() = returns boolean if input stream can use the mark and reset methods
    .reset() throws IOException = Repositions the input stream at the time the mark method was last called on it

    .available() throws IO Exception = returns int of estimated bytes that can be read from the input stream
    .ready() = returns boolean if input stream is ready to be read
    .skip(Long n) throws IOException = (long) skips over and discards n bytes from the input stream
    .close() throws IOException = closes the input stream
                                  ALWAYS CLOSE THE INPUT STREAM


    Use InputStreamReader

    InputStreamReader(InputStream) = creates an InputStreamReader with default Charset
    InputStreamReader(InputStream, Charset) = same as above, but with a specified Charset
    InputStreamReader(InputStream, CharsetDecoder) = same as above, but with a specified charset decoder
    InputStreamReader(InputStream, String) = same as above, but with (the name of) a specified Charset

    FileReader(File) = creates a FileReader given the File to read from
    FileReader(String) = same as above, but with the name of a File

    .length() = returns a long of the FileReader length

    Use BufferedReader

    BufferedReader(Reader) = creates a buffering character-input stream using a default-sized input buffer
    BufferedReader(Reader, int size) = same as above, but with a specified sized input buffer
    
    .readLine() = returns a string of the next line
                  differentiates lines with '\n' or '\r'
                  first line is 0, returns null when there is no more lines

    Use LineNumberReader

    LineNumberReader(FileReader) = creates a LineNumberReader using a FileReader
                                   each line ends using '\n'

    .readLine() = returns a string of the next line
                  differentiates lines with '\n' or '\r'
                  first line is 0, returns null when there is no more lines
    .setLineReader(int) = sets the line number (not really, only changes the value of getLineNumber())
    .getLineNumber() = returns the current line number

    Writer -----------------------------------------------------

    Writer classes uses character oriented streams

    Writer()
    
    .append(char) =                         appends the character to the writer
    .append(CharSequence) =                 appends the character sequence to the writer
    .append(CharSequence, int i, int f) =   same as above, but only the subsequence of the character sequence
    
    .close() = closes the output stream
    .fluch() = flushes the output stream
    
    .write(char[]) =                    writes the char[].length number of bytes from the specified array to the output stream
    .write(char[], int off, int len) =  same as above, but writes starting at offset to the output stream
    .write(int) =                       writes the specified byte from the output stream
    .write(String, int off, int len) =  writes a portion of a string

    Use OutputStreamWriter

    OutputStreamWriter(OutputStream) = creates an OutputStreamWriter using default character encoding
    OutputStreamWriter(OutputStream, Charset) = same as above, but with a specified charset
    OutputStreamWriter(OutputStream, CharsetEncoder) = same as above, but with a specified Charset encoder
    OutputStreamWriter(OutputStream, String charset) = same as above, but with the name of the Charset encoder
    
    .getEncoding() = returns a string representing the name of the character encoding being used by the stream

    Use FileWriter

    FileWriter(File) = creates a FileWriter using a File
    FileWriter(File, boolean append) = same as above, 
                                       but will append to the File if true or overwrite the File if false
    FileWriter(String) = same as above, but with the name of the File
    FileWriter(String, boolean append) = same as above, but with the name of the File

    Use BufferedWriter

    BufferedWriter(Writer) = creates a buffered character-output stream using a default-sized output buffer
    BufferedWriter(Writer, int size) = same as above, but with a specified sized output buffer

    .newLine() = writes a line seperator
                 uses line.seperator, which may be one or more '\n' characters

    Use PrintWriter

    PrintWriter(File) = creates a PrintWriter, without automatically flushing the line
    PrintWriter(String) = same as above, but with the name of the File
    PrintWriter(OutputStream) = same as above, but with an existing OutputStream
    PrintWriter(OutputStream, boolean auto) = creates a PrintWriter from an existing OutputStream when true
    PrintWriter(Writer) = same as above, but with a Writer
    PrintWriter(Writer, boolean auto) = same as above, but with a Writer

    .print(___) = prints any type of variable to a string
                  formats the output
    .write(___) = prints a single character, array of characters, and strings

    BasicFile class pictures are at this part

    StreamTokenizer --------------------------------------------

    Use StreamTokenizer 

    StreamTokenizer(Reader) = creates a StreamTokenizer using a Reader (or its subclasses)

    TT_WORD = states that token is a string
              the string is stored in the variable sval
    TT_NUMBER = states that the token is a number (double)
                the number is stored in the variable nval
    TT_EOF = states that the token if the end of the file marker
             "the end of the file has been reached"
    TT_EOL = states that the token is an end of line marker
             "the end of a line has been reached"
    sval = stores the string token, as above
    nval = stores the number token, as above
    ttype = contains the type of the token, any of the four constants above

    .commentChar(int) = specified that the character argument starts a single-line comment
    .ordinaryChar(int) = specified that the character argument is "ordinary" int
                         removes any significance to the value of the int
    .ordinaryChar(int i, int f) = same as above, but with a specified sequence of characters
    .quoteChar(int) = specified that matching pairs of this character delimit string constants in this tokenizer
    .whitespaceChar(int i, int f) = specified that the characters in the specified sequence are white space characters
    .wordChars(int i, int f) = specified that the characters in the specified sequence are words (TT_WORD)
                              use when symbols (@#$) cannot be recognized as strings

    .eolIsSignifican(boolean) = an end of line (eol) is recognized when true
    .lineno() = returns int of the current line number
    .lowerCaseMode(boolean) = case sensitivity is ignored when true (all uppercase characters convert to lowercase)
    .nextToken() = parses the next token from the input
                   returns an int
    .parseNumbers() = specifies that the numbers should be parsed digit by digit
                      except for floating point numbers
    .pushBack() = causes the next call of the nextToken() method to return the current value of ttype
                  and for sval and nval to remain unmodified
    .resetSyntax() = resets the tokenzer's syntax table so all characters are "ordinary"
    
    .slashSlashComments(boolean) = recognizes C++ style comments when true
    .slashStarComments(boolean) = recognizes C style comments when true
    
    .toString() = returns the string representation of the current stream

    Random Access File -----------------------------------------

    RandomAccessFile(File, String mode) = creates a random access file stream to read from,
                                          and optionally to write to the file specified
                                          
    RandomAccessFile(String, String mode) = same as above, but with the name of the File
    Types of modes:
    "r" = file is opened in a read-only mode
    "rw" = file is opened in a read-write mode
           file is created if it doesn't exist
    "rws" = file is opened in a read-write mode
            any modifications to the file's content and its metadata are written to the storage device immediately

    .getFilePointer() = returns int of the current position
    .seek(int) = sets the file pointer position
                 0 is the beginning of the file, .length() - 1 is the last position
    .read___() = returns the string of the next string (which can be any variable) of the file
    .write___(___) = writes the variable as a string in the file
    
    Charset ----------------------------------------------------

    US-ASCII
    ISO-8859-1
    UTF-8
    UTF-16EE
    UTF-16LE
    UTF-16

    Date -------------------------------------------------------

    Use the imports java.util.Date and java.util.ArrayLists

    dateName.toString() = A function that converts a Date instance to a string

    Date varName = new Date() = Creates a date variable

    When using a Date as an ArrayList instance of another class:
    declare it as "ArrayList<Date> varName"
    assign it as "varName = new ArrayList<Date>()"
    use it as "varName.toString" --------------------not sure why this is useful

    Use the import java.text.DateFormat for formating the date variables

    DateFormat dateFormatName = DateFormat.getDateInstance(DateFormat.formatType) = creates a date format variable with the variable of the format type
    formatType = LONG = Month dd, yyyy
               = FULL = dayName, Month dd, yyyy
               = MEDIUM = Month dd, yyyy
               = SHORT = mm/dd/yyyy
    
    dateFormatName.format(dateVarName) = funtion that puts the date variable into the date format format

    JFileChooser -----------------------------------------------

    Use the import javax.swing.JFileChooser

    JFileChooser() = points to the default directory
    JFileChooser(File) = points to the specific directory

    .setDialogTitle(String) = Sets up the header of the file selector

    .showOpenDialog(null) = opens up a open file selector and saves the selected file
                            returns int of the selected option (.APPPROVE_OPTION, .CANCEL_OPTION)
    .showSaveDialog(null) = same as above, but the default header and the approve button say "Save" instead of "Open"
    .showDialog(null, String) = same as above, but the header and approve button will say the String
    
    .getSelectedFile() = returns the file that was selected in the file selector

    Random -----------------------------------------------------

    Use the import java.util.Random

    Random varName = new Random() = Creates a Random variable

    varName.nextInt(num) = Picks a random value between 0 and num
                           The draw includes 0 but not num.

    Formating --------------------------------------------------

    NumberFormat varName = NumberFormat.getCurrencyInstance() = Creates a format for money ($ , .)

    For formating dates, read the Date section above

    Casting ----------------------------------------------------

    (int)num = floors the float/double num, and converts num into an integer.

    (varName instanceof varType) = a true/false operator that determines if varName is a type of varType variable
    if(objectName instanceof objectType) = a true/false conditioner that checks if the "objectName" has an object of "objectType"
    
    ((objectType) objectName).method() = "objectName" is casted into being an object of "objectType"
                                         afterwards, the method from the "objectType" class is called
                                         use when "objectName" is a placeholder value, like in an enhanced for loop
                                         Focus on the paranthesis, they determine the order
                                         Typically, calling an object from an ArrayList will keep it as the standard object, not as its actual object, thus, casting is needed

    Collection -------------------------------------------------

    Collection is an interface that only uses a value

    .size() = returns int of the number of elements in the collection
    .isEmpty() = returns boolean for if the list is empty
    .iterator() = returns an iterator object over the elements in this collection
                  it is used to transverse the collection of elements
    .remove(Object) = removes the object from the collection
                      returns true if object was removed successfully
    .contains(Object) = returns boolean for if the object is in the collection
    .add(Object) = adds the object to the collection (if duplicates are allowed)
                   returns true if object was added successfully

    .containsAll(Collection) = returns boolean for if the collection contains the inputed Collection
    .addAll(Collection) = add the inputted Collection to the collection (if duplicates are allowed)
                          returns boolean if addition was successful
    .removeAll(Collection) = removes the elements of the inputted Collection from the collection
    .retainAll(Collection) = retains the both collections share (c1 = c1 AND c2)
                             returns boolean if retain was successful
    .clear() = empties the collection

    Use Sets for unordered collection with no pairs of elements
    
    .equals(Set) = returns boolean for if both sets are equal

    Use Hashset for Sets without duplicates

    Hashset() = create a Hashset
    Hashset(Collection) = create a Hashset using a collection
    Hashset(int size) = creates a set with an initial capacity
    Hashset(int size, float loadFactor) = same as above, but with a specified load factor

    Use TreeSet for sorted Hashsets

    TreeSet(Collection <?extends> c) = creates a TreeSet using a Collection, sorted based on the elements' natural order?
    TreeSet(Comparator <?super E> comparator) = creates an empty TreeSet sorted according to the specified comparator
    TreeSet(SortedSet) = creates a TreeSet using a sorted set

    Use a Stack when only using the recently added element (top of the stack)
    java.util.Stack

    Stack() = creates a stack
    
    .empty() = returns boolean for if the stack is empty
    .peek() = returns object at the top of the stack without removing it
    .pop() = returns object at the top of the stack and removes it
    .push(Object) = puts an object on the top of the stack
    .search(Object) = returns int of the position of the object

    Use a Deque to only have access to the first and last elements

    .addLast(element) = appends the element to the end of the deque
    .removeFirst() = returns and deletes the first element from the deque

    Use a Queue to only have one end appendable and the other end removable

    .add(element) = appends the element to the end of the queue
    .remove() = returns and deletes the first element from the queue

    Linked List uses nodes: a data and an address component

    The first node typically has no data (just the name of the linked list)
    The last node typically has a null data

    

    Map --------------------------------------------------------

    Map is an interface that uses a key and a value

    .clear() =                      removes all entries from the map
    .isEmpty() =                    returns boolean for if the map has no key-value mappings
    .containsKey(Object key) =      returns boolean for if the inputted key of the map contains a value
    .containsValue(Object value) =  returns boolean for if the inputted value of the map contains a key
    
    .get(Object key) =      returns value of the inputted key of the  map
                            returns null if key does not exist in the map
    .equals(Object key) =   returns boolean for if the two objects are identical
    .put(key, value) =      associates the value with the key in the  map
                            also returns the value
    .remove(Object key) =   removes the mapping for the key in the map
                            also returns the removed value,
                            or returns null if key-value mapping did not exist
    .size() =               returns int of the number of key-value mappings in the map

    Set<Map.Entry<K,V>> .entrySet() = returns a Set view of the mappings of this map
    Set<K> .keySet() = returns a Set view of the keys in the map
    Collections <K> .values() = returns a Collection view of the values in the map

    Use a Hashtable for

    Hashtable() = creates a Hashtable with a 
                  default initial capacity of 11 and a default load factor of 0.75
    Hastable(int initialCapacity) = same as above,
                                    but with a specified initial capacity
    Hastable(int initialCapacity, float increment) = same as above,
                                                     but with a specfied initial capacity and a specified load factor

    Use a HashMap for

    HashMap() = creates a HashMap with
                a default initial capacity of 16 and a default load factor of 0.75

    Windows ----------------------------------------------------

    Use JFrame (import javax.swing.JFrame) to make pop-up windows

    JFrame(String) = creates a JFrame with a title (heading)

    .setVisible(boolean) = makes the JFrame visible on true
    
    .setBounds(int xPos, int yPos, int width, int height) = sets a position and size of the JFrame
    .setBounds(Rectangle) = same as above, but uses a Rectangle

    .setDefaultCloseOperations(int) = use to discard the program and terminate the program
                                        JFrame.EXIT_ON_CLOSE = terminates the program when JFrame is closed

    ---------------------------
    Use IconImage (import javax.swing.ImageIcon) to set the frame icon of the JFrame

    ImageIcon(File) = creates an ImageIcon using a file
    ii.getImage() = returns the Image of the ImageIcon
    
    jFrame.setIconImage(Image) = sets the frame icon of the JFrame

    ---------------------------
    Use Toolkit (import java.awt.Toolkit) to access Dimensions (import java.awt.Dimension) of the JFrame

    Toolkit.getDefaultToolkit() = returns the default toolkit
    jFrame.getToolkit() = return Toolkit (features) of the JFrame

    tk.getScreenSize() = returns a Dimension of the screen's size using a Toolkit

    d.width() = returns width of the Dimension
    d.height() = returns height of the Dimension

    cntr.setSize(int x, int y) = sets the JFrame size using it's Container and with width and height

    ---------------------------
    Use Container (import java.awt.Container) to access the content pane (like background colors, cursor, and buttons)
    Also use for Layout Managers (below)
    Use import java.awt.Color and java.awt.Cursor
    
    jFrame.getContentPane() = returns the Container of the jFrame's Content Pane
    
    cntr.setBackground(Color.___) = sets the background color of the jFrame using a Collection

    cntr.add(Object) = after getting the Content Pane, sets the ContentPane to anything
                       a JScrollPane can be added
    
    Cursor.getPredifinedCursor(int) = returns one of the predifined Cursor of the class Cursor
                                        Cursor.WAIT_CURSOR
    cntr.setCursor(Cursor) = sets the Cursor for the JFrame using a Container

    ---------------------------
    Use JMenuBar (import javax.swing.JMenuBar) to set the menu bar

    JMenuBar() = creates a JMenuBar
    JFrame.setJMenuBar(JMenuBar) = sets the JMenuBar to the JFrame

    ---------------------------
    Use JMenu (import javax.swing.JMenu) to add choices in the menubar (View)
    
    JMenu(String) = creates a menu choice with a name
    JMenu(Icon) = creates a menu choice with an icon (image)

    jmenuBar.add(jMenu) = adds the menu choice to the menubar

    ---------------------------
    Use JMenuItem (import javax.swing.JMenuItem) to add menu items to menu choices (a submenu for a menu choice) (Editors)

    jMenuItem(String) = creates a menu item with a name

    jMenu.add(jMenuItem) = adds the menu item to the menu choice
    jMenu.addSeperator() = adds a seperating line in between the menu items of the menu choice

    ---------------------------
    Use JRadioButton and ButtonGroup (import javax.swing.___) to create a cascading menu from a menu item (a submenu within a submenu) (Source)

    JRadioButton(String) = creates a menu item for the menu item (a submenu for a menu item)
    
    JMenu.add(JRadioButton) = attaches the menu item to a menu item
    
    ButtonGroup() = creates a ButtonGroup

    bg.add(JRadioButton) = attaches the menu item to a ButtonGroup

    ---------------------------
    Use JButton (import javax.swing.JButton) to add buttons to the content pane

    JButton() =                 creates a JButton with no text nor icon
    JButton(Icon) =             creates a JButton with an icon
    JButton(String) =           creates a JButton with text
    JButton(String, Icon) =     creates a JButton with text and an icon
    JButton(String, int) =      creates a JButton with text and a keyboard mnemonic (Alt + ___)
    JButton(Action) =           creates a JButton with properties of the Action

    Use JButton with the Layout Managers below (with a Container)
    
    container.setLayout(Layout Manager) = sets the Layout Manager to the Container
                                          ? JFrame can be used instead of Container
                                          alternative to .addLayout(Layout Manager)

    JFrame.add(JButton) = used after container.setLayout(Layout Manager)
                          adds the JButton to the frame
    container.add(JButton) = adds the JButton to the content pane
                             this method is more universal
    container.add(Object) = after getting the Content Pane, sets the ContentPane to anything
                            a JScrollPane can be added

    ---------------------------
    Use FlowLayout (import java.awt.FlowLayout) to add buttons based on a single row on the content pane

    FlowLayout() = creates a FlowLayout with centered alignment and 5 pixel horizontal and vertical gaps between components
    FlowLayout(int align) = same as above, but with a specified alignment
    FlowLayout(int align, int hgap, int vgap) = same as above, but with specified alignment and gaps

    ---------------------------
    Use GridLayout (import java.art.GridLayout) to add buttons formatted as a grid on the content pane (fills the screen)

    GridLayout() = creates a GridLayout with one column per component, in a single row
    GridLayout(int rows, int columns) = creates a GridLayout with specified rows and columns
    GridLayout(int rows, int columns, int hgap, int vgap) = same as above, but with specified horizontal and vertical gaps

    ---------------------------
    Use BorderLayout (import) to split the components into north, south, west, east, and center
    
    JFrame.add(JButton, int position) = puts the button in the specified position of the frame
                                        BorderLayout.NORTH, WEST, EAST, CENTER, SOUTH

    container.add(JButton, int position) = same as above, but puts the button in the content pane
    ---------------------------
    Use GridBagLayout (import java.awt.GridBagLayout) to add buttons on an (x,y) coordinate system
    Use GridBagContraints and Insets (import java.awt.___) to reposition and resize components

    GridBagLayout() = creates the GridBagLayout

    GridBagConstraints() = creates the GridBagConstraints
    JFrame.add(GridBagLayout) = sets the frame to the GridBagLayout

    gbc.gridx = the x position of the button
                changing it changes the x position
    gbc.gridy = the y position of the button
                changing it changes the y position

    gbc.gridwidth = the width of the button
                    changing it changes the width
    gbc.gridheight = the height of the button
                     changing it changes the height
    
    gbc.fill = an int used to resize the button to fit its text/icon
               GridBagConstraints.NONE = no resizing
               GridBagConstraints.HORIZONTAL = only resizes the width
               GridBagConstraints.VERTICAL = only resizes the height
               GridBagConstraints.BOTH = resizes both width and height
               GridBagConstraints.CENTER = ???

    ---------------------------
    Use insets (import) to place distance between buttons in GridBagLayout
    
    Insets(int top, int left, int, bottom, int right) = creates an Inset with specified dimensions on the frame
                                                        a grid to place the components

    gbs.insets = the insets of the GridBagLayout
    
    GridBag.setConstraints(JButton, gbs) = sets the button within the constraints in the GridBag
    
    frame.add(JButton) = adds the JButton (with the constraints) to the frame
    container.add(JButton) = same as above, but to the content pane
    ---------------------------
    Use JPanels (import javax.swing.JPanel) to group components together

    JPanel(LayoutManager) = creates a JPanel with using a specified Layout Manager
    
    JPanel.add(JButton) = adds the JButton to the JPanel

    frame.add(JPanel) = adds the JPanel to the frame

    ---------------------------
    Use JLabels for non-selectable text/images on the frame

    JLabel() =                          creates a JLabel
    JLabel(Icon) =                      creates a JLabel with an Icon
    JLabel(Icon, int align) =           same as above, but with horizontal alignment
    JLabel(String) =                    creates a JLabel with a title
    JLabel(String, int align) =         same as above, but with horizontal alignment
    JLabel(String, Icon, int align) =   mix of everything above
    
    JLabel.CENTER = default placement
                    int for a center placement
    JLabel.LEFT = int for left placement
    JLabel.RIGHT = int for right placement 
    JLabel.LEADING = int for leading placement
    JLabel.TRAILING = int for trailing placement

    container.add(JLabel) = puts the JLabel in the content pane
    container.add(JLabel, BorderLayout.CONSTANTS) = same as above, but with a BorderLayout placement

    ---------------------------
    Use Graphics to create drawings or text
    Color and Font are classes for graphics with different color and font

    Color(float r, float g, float b) =  creates a Color from individual rgb range (each is in range 0.0 - 1.0)
    Color(int rgb) =                    creates a Color from a singular rgb value (blue = 0-7, green = 8-15, red = 16-23)
    Color(int r, int g, int b) =        creates a Color from individual rgb values (each in range 0 - 255)

    Color.____ = any color constants
                 Spelled like: RED or red; DARK_GREY or darkGrey

    Font(String font, int style, int size) =    creates a Font with a font, style, and size
    Font(Font) =                                creates a Font using a Font

    Font.BOLD =                 int for bold style
    Font.ITALIC =               int for italic style
    Font.PLAIN =                int for plain/no style
    Font.BOLD | Font.ITALIC =   ints for bold and italic style

    Graphics() = creates a Graphics

    .setColor(Color) = sets the color of the Graphics
    .setFont(Font) = sets the font of the Graphics

    These methods use the current color and font of the graphic to make the drawing
    .drawLine(int x1, int y1, int x2, int y2) = draws a line using two points
    
    .drawOval(int x, int y, int width, int height) = draws the outline of an oval using a center point and dimensions
    
    .drawPolygon(int[] x, int[] y, int numOfPoints) = draws the outline of a polygon using an array of points
    .drawPolygon(Polygon) = draws the outline of a polygon using a Polygon
    .fillPolygon(int[] x, int[] y, int numOfPoints) = fills a polygon using an array of points
    .fillPolygon(Polygon) = fills a polygon using a polygon

    .drawRect(int x, int y, int width, int height) = draws the outline of a rectangle using the top-left point and dimensions
    .drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) = same as above, but the corners are rounded
    .fillRect(int x, int y, int width, int height) = fills a rectangle using the top-left point and dimensions
    .fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) = same as above, but the corners are rounded

    .drawArc(int x, int y, int width, int height, int iAngle, int fAngle) = draws an outline of an arc using the top-left point, dimensions, and initial and final angles
    .fillArc(int x, int y, int width, int height, int iAngle, int fAngle) = fills an arc using the top-left point, dimensions, and initial and final angles
    

    .drawString(String, int x, int y) = draws a String (of the String) using the leftmost point
    
    Listener ---------------------------------------------------

    Use ActionListoner for handling events (specifically when a JButton is clicked on)
    Import java.awt.event.ActionListener
    Import java.awt.event.ActionEvent
    
    ActionListener() = creates an ActionListener

    JMenuItem.addActionListener(ActionListener) = sets an ActionListener to a menu item

    void actionPerformed(ActionEvent e) {code} = a method that uses the event that activated it (e)
                                                 followed by code that will run when the event is performed
                                                 used as the ActionListener parameter for:
                                                 JMenuItem.addActionListener(ActionListener)
                                                 e.getActionCommand = returns String of the clicked menu item
                                                 in the method, the e. is not necessary

    This pattern of ___Listener and ___Event is similar for all Listener Interfaces
    ---------------------------
    Use WindowListener (java.awt.event.WindowAdapter and java.awt.event.WindowEvent) for window-related events
    
    frame.addWindowListener(WindowAdapter) = adds the Window Listener to the frame
    
    new WindowAdapter()
    {
    void window___(WindowEvent e) {code}
    }                                   = a method that uses the event that activated it (e)
                                          followed by code that will run when the event is performed
                                          used as the WindowListener parameter for:
                                          frame.addWindowListener(WindowAdapter)
    
    windowOpened(WindowEvent e) = a method performed when the window first opens
    windowClosing(WindowEvent e) = a method performed the close button is clicked
                                   two ways to end the program from closing the window:
                                    System.exit(0)
                                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    
    windowClosed(WindowEvent e) = a method performed when the window closed from calling dispose on the window
    windowDeiconified(WindowEvent e) = a method performed when the window turns from normal size to minimized
    windowIconified(WindowEvent e) = a method performed when the window turns from minimized to normal size
    windowActivated(WindowEvent e) = a method performed when the window is set to the active window
    windowDeactivated(WindowEvent e) = a method performed when the window is not set to the active window

    ---------------------------
    Use HyperlinkListener for hyperlink-related events
    JEditorPane is used to reference the editor pane object
    JTextField is used to make a text field/box in the frame

    JEditorPane.addHyperLinkListener(HyperLinkListener) = adds the HyperLink Listener to the JEditorPane

    void hyperlinkUpdate(HyperlinkEvent e) {code} = a method that uses the event that activated it (e)
                                                    followed by code that will run when the event is performed
                                                    contents.setPage(e.getURL().toString()) = sets contents to the URL page in String
                                                    enter.setText(e.getURL().toString()) = returns the URL page
                                                    e.getEventType() is equal to three values:
                                                     HyperlinkEvent.EventType.ACTIVATED = link is clicked
                                                     HyperlinkEvent.EventType.ENTERED = mouse is hovered over link
                                                     HyperlinkEvent.EventType.EXITED = mouse is no longer hovered over link

    ---------------------------
    Use MouseListener for mouse-related events
    MouseAdapter is for hovering, depressing, pressing, and clicking
    MouseMotionAdapter is for moving and dragging
    MouseInputListener is for both adapters above

    addMouseListener(___) =  

    addMouseMotionListener(___) = 

    JButton.addMouseAdapter(new MouseAdapter()
        {
            void mouse___(MouseEvent e) {code}
        }
    )                                           = a method that uses the event that activated it (e)
                                                  followed by code that will run when the event is performed

    mouseEntered(MouseEvent e)
    mouseExited(MouseEvent e)
    mousePressed(MouseEvent e)
    mouseClicked(MouseEvent e)
    mouseReleased(MouseEvent e)

    mouseMoved(MouseEvent e) = a method performed when the mouse hovers over a component
    mouseDragged(MouseEvent e) = a method performed when the mouse is 
                                 pressed over a component and drags until it is depressed

    e.getX = gets X position of mouse during MouseEvent
    e.getY = gets Y position of mouse during MouseEvent
    ---------------------------
    Use KeyListener for key strokes being typed

    keyPressed(KeyEvent e)
    keyReleased(KeyEvent e)
    keyTyped(KeyEvent e)

    ---------------------------
    Use TextListener for recieving text events, when the value of the text changes

    textValueChanged(TextEvent e)

    Classes ----------------------------------------------------

    subClass extends superClass = extends subClass to superClass (1 - the subclass - contains the variables of 2 - the superclass, can only extend one superclass)
    super(var1, var2) = assigns the values of the extended/superclass
    super = calls the values of the extended/superclass
    super.toString() = converts the values of the extended/superclass to Strings??
    super.methodName() = used when a method of the subclass overrides a method in its superclass
                         both methods must have the same name
                         must be the first line in the overriding subclass method

    abstractMethod(var possibleParameter); = an abstract method
                                             the semicolon is necessary, there should be no method body {}
                                             a return statement should not be used if the method has a return type (note the lack of a method body {})

    Abstract classes
    abstract class ClassName = a class for abstract and concrete methods(abstract methods need to get overrided subclasses that extends it)
                               the class can be referenced (ClassName varName;)
                               the class cannot be instantiated (new ClassName() cannot be used, so the constructor ClassName() cannot be called directly)
                               all variables can be instances
                               for the subclasses that extends an abstract class:
                                abstract methods need to be overrided while (non-final) concrete methods are either inherited or overrided
                                an instance of the subclass is possible (the subclass constructor will be the one to call the abstact class contructor)

    Interface classes
    interface ClassName = a class for public and abstract methods by default (private and static methods are possible, but concrete methods are not)
                          the class can be referenced (ClassName varName;)
                          the class cannot be instantiated (new ClassName() cannot be used, so the constructor ClassName() cannot be called directly)
                          all fields/variables are automatically public, static, and final (only constants)
                          no variables can be instances
                          for the subclasses that implements the interface class:
                           all methods are abstract, thus any subclasses need to override all methods
                           an instance of the subclass is possible (the subclass constructor will be the one to call the interface class contructor)
    className implements interfaceClass = if an interface class is being inherited, use implements (instead of extends) (can implement multiple classes)
                                         
    Exceptions -------------------------------------------------

    Checked Exceptions: exceptions found within compilation (i.e. FileNotFound and IOExceptions)
                        exceptions must be handled
    Unchecked Exceptions: exceptions found within running (i.e. ArithmeticExceptions /0, ArrayIndexOutOfBounds)
                          can technically be worked around without using exceptions/try-throw-catch-final

    try-throw-catch-finally
    try{} = a method that holds the code where an exception might occur
            the code stops when an exception is made (by the throw) and will go straight to the catch methods
    throw = the code within try{} where the exception will be turned into an Throwable object (sometimes it is done automatically)
            Throwable() = creates a Throwable object
            Throwable(String) = creates a Throwable object with a message
    catch(typeException e){} = a method that handles the Throwable object
                               e.printStackTrace() = prints what type of exception had occured (prints the throwable and its trace)
                               e.getMessage() = returns the message of the Throwable object
                               e.toString() = returns a string message of the Throwable object
    catch(E1 | E2 | E3){} = a catch method that handles multiple exceptions
                       use only when exception class are unrelated
    finally = always runs regardless if the code had an exception
              finally{} will always run before any return statement in try{} or catch{}
              never use return, continue, or block in finally{}, as these statements in try{} or catch(e){} will never run

    className throws typeException = written in the class name or method name
                                    the class/method will not catch the exception, the exception class will
                                    multiple exceptions can be thrown using ,

    myException extends Throwable = extends the throwable class, which is used when creating your own exceptions

    className extends myException = use "extends" instead of "throw" when using your own exception

    
    java.lang.ArithmeticException = 
    java.lang.IndexOutOfBounds = 
    java.util.EmptyStackException = 
    java.io.FileNotFoundException = use when a nonexistant file is being used
    java.io.IOException = use when a necessary input returns null (the CANCEL option is selected or nothing is inputted)
    java.lang.NullPointerException = use when a necessary valued variable/object is used when null

    Other ------------------------------------------------------

    (condition) ? exprWhenTrue : exprWhenFalse = conditional expression of an if statement using a boolean
                                 recommended to only use for assignment statements

    printf("%-P.AT", var) = var replaces the %,
                            that is a "T" type variable (d for integer, f for floating-point numbers, or s for string),
                            has a total of "P" places to display,
                            and "A" places after the decimal point.
                            Insert the - when you want the var to be aligned to the left (var   , compared to,     var).

    

    


*/

public class DotClass {
    
    public static void main(String[] args){
        System.out.println("Testing");
        
        JFrame f = new JFrame("Test Window");
        
/*        JMenuBar mb = new JMenuBar();
        f.setJMenuBar(mb);
        
        // JMenu = View
        // JMenuItem = Editor
        
        JMenu jm = new JMenu("Student (JMenu)");
        
        JMenuItem jmiName = new JMenuItem("(JMenuItem)");
        
        mb.add(jm); // Adds Student (JMenu) to MenuBar
        
        jm.add(jmiName); // Add (JMenuItem) to Student (JMenu)
        
        jm.addSeparator();
        
        jmiName = new JMenuItem("Name");
        jm.add(jmiName);
        jm.addSeparator();
        JMenuItem jmi2 = new JMenuItem("Course");
        
        
        JMenuItem jmiClass;
        jmiClass = new JMenuItem("COP3337");
        jmi2.add(jmiClass);
        jmiClass = new JMenuItem("COP2210");
        jmi2.add(jmiClass);
        
        mb.add(jmi2);

*/        


       JMenuBar mBar = new JMenuBar();
       f.setJMenuBar(mBar);
      
       // Create menu
       JMenu studMenu = new JMenu("Student");
      
       // Add menu to the menubar
       mBar.add(studMenu);
       
        // Create menuitems
       JMenuItem nameMItem = new JMenuItem("Name");
       
       JMenu courseMItem = new JMenu("Course");
      
       // Add menuitems to the menu
       studMenu.add(nameMItem);
       studMenu.add(courseMItem);
        
        // Add sub menu to course
       JMenuItem cop3337MItem = new JMenuItem("COP3337");
       JMenuItem cop2210MItem = new JMenuItem("COP2210");
       courseMItem.add(cop3337MItem);
       courseMItem.add(cop2210MItem);
      
        f.setBounds(500, 200, 400, 200);
        
        f.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e){
                    
                    System.out.println(e.toString());
                    System.exit(0);
                }
            }
        );
        f.setVisible(true);
        
    

    }
    
    

}
