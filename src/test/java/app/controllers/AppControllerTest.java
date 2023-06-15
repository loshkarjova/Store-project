package app.controllers;

import app.models.AppModel;
import app.utils.Constants;
import app.views.AppView;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AppControllerTest {
    private AppController controller;
    @Mock
    private AppModel model;
    @Mock
    private AppView view;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        controller = new AppController(model, view);
    }


    @Test
    void test_runApp_When_ChooseOption_1() {
        when(view.chooseOption()).thenReturn(1);
        controller.runApp();
        verify(model).runProductDiscount();
    }

    @Test
    void test_runApp_When_ChooseOption_2() {
        when(view.chooseOption()).thenReturn(2);
        controller.runApp();
        verify(model).runProduct();
    }

    @Test
    void test_runApp_When_ChooseOption_0() {
        when(view.chooseOption()).thenReturn(0);
        controller.runApp();
        verify(view).getOutput(Constants.JOB_QUIT_MSG, 0);
    }

    @AfterEach
    void tearDown() {
        controller = null;
    }
}
