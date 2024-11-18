package ultils;

import service.Interface.EmailMatcher;

import java.util.regex.Pattern;

public class ValidateEmail implements EmailMatcher {
    private static Pattern DATE_PATTERN = Pattern.compile("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$");

    @Override
    public boolean matches(String email) {
        return DATE_PATTERN.matcher(email).matches();
    }
}
