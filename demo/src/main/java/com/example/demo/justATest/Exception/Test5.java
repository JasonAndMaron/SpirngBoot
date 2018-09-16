package com.example.demo.justATest.Exception;

public class Test5 {
    public static void main(String[] args) {
        System.out.println("return value of getValue(): " + getValue());
    }
//    执行结果:
//    return value of getValue(): 1

    public static int getValue() {
        int i = 1;
        try {
            return i;
        } finally {
            i++;
        }
    }
}
    /********************************************************************************

    a finally clause is always entered with a reason. That reason may be that the try code finished normally,
    that it executed a control flow statement such as return, or that an exception was thrown in code executed
    in the Try block. The reason is remembered when the finally clause exits by falling out the bottom.
    However, if the finally block creates its own reason to leave by executing a control flow statement
    (such as break or return) or by throwing an exception, that reason supersedes the original one, and the
    original reason is forgotten. For example, consider the following code:
    try {
    … do something …
    return 1;
    } finally {
    return 2;
    }
    When the Try block executes its return, the finally block is entered with the “reason” of returning
    the value 1. However, inside the finally block the value 2 is returned, so the initial intention is
    forgotten. In fact, if any of the other code in the try block had thrown an exception, the result would
    still be to return 2. If the finally block did not return a value but simply fell out the bottom,
    the “return the value 1 ″ reason would be remembered and carried out.

    ********************************************************************************/