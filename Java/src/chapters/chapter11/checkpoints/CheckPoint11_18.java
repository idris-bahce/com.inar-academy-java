package chapters.chapter11.checkpoints;

public class CheckPoint11_18 {
    //Matching a method signature and binding a method implementation are two separate issues.
    // The declared type of the reference variable decides which method to match at compile time.
    // The compiler finds a matching method according to parameter type, number of parameters,
    // and order of the parameters at compile time. A method may be implemented in several subclasses.
    // The JVM dynamically binds the implementation of the method at runtime,
    // decided by the actual class of the object referenced by the variable.
}
