package design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {

    public enum ErrorType {GenericSystemError,PageNotFoundError,ServerError};
    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();
    public static  ErrorMessageFactory getInstance(){
        return FACTORY;
    }
    private Map<ErrorType,SystemErrorMessage> errorMessages = new HashMap<>();
    private ErrorMessageFactory(){
        errorMessages.put(ErrorType.GenericSystemError,new SystemErrorMessage("A generic error of type $errorCode Please refer to:\n","https://google.com"));
        errorMessages.put(ErrorType.PageNotFoundError,new SystemErrorMessage("A page not found error of type $errorCode Please refer to:\n","https://google.com"));
    }
    public SystemErrorMessage getError(ErrorType type){
        return errorMessages.get(type);
    }
    public UserBannedErrorMessage getUserBannedMessage(String caseId){
        return new UserBannedErrorMessage(caseId);
    }

}
