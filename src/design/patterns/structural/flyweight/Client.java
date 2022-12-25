package design.patterns.structural.flyweight;

public class Client {
    public static void main(String[] args) {
        SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.GenericSystemError);
        System.out.println(msg1.getText("4056"));
        UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1282");
        System.out.println(msg2.getText("1256"));
    }
}
