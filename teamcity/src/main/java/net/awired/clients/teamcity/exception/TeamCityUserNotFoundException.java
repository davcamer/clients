package net.awired.clients.teamcity.exception;

public class TeamCityUserNotFoundException extends Exception {

    private static final long serialVersionUID = 37900680676102640L;

    public TeamCityUserNotFoundException(String msg, Throwable t) {
        super(msg, t);
    }

}
