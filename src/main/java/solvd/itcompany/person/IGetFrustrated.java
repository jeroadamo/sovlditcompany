package solvd.itcompany.person;

import solvd.itcompany.exceptions.CannotWorkException;

public interface IGetFrustrated  {
    void frustration(Employee worker, boolean frustrated) throws CannotWorkException;
}
