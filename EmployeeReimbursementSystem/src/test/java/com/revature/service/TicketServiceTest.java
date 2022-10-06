package com.revature.service;

import com.revature.exceptions.InvalidAmountException;
import com.revature.exceptions.InvalidCategoryException;
import com.revature.repository.TicketTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;

@ExtendWith(MockitoExtension.class)
public class TicketServiceTest {

    @Mock
    private TicketTable tt;

    @InjectMocks
    private TicketService ts;

    @Test
    public void testSubmitTicketLessThanZero() throws InvalidAmountException {

        Assertions.assertThrows(InvalidAmountException.class, () -> {

            ts.submitTicket(-100, "hjsdfb", 1, 1);
        });
    }

    @Test
    public void testSubmitTicketWrongCategoryId() throws InvalidCategoryException {

        Assertions.assertThrows(InvalidCategoryException.class, () -> {

            ts.submitTicket(100, "hhf", 5, 1);
        });
    }

//    @Test
//    public void testUpdateTicket

}
