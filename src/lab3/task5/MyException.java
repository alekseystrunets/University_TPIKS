package lab3.task5;

class MyException extends Exception {
    public MyException() {
        super("Wrong login format.");
    }

    public MyException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Wrong password format or mismatch.");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

