package com.example.demowebapplabo.servlets;

import com.example.demowebapplabo.models.dtos.AnimalDTO;
import com.example.demowebapplabo.services.AnimalService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/animal")
public class AnimalServlet extends HttpServlet {

    @Inject
    private AnimalService animalService;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<AnimalDTO> animals = animalService.getAll();
        request.setAttribute("animals",animals);
        request.getRequestDispatcher("/WEB-INF/pages/animal.jsp").forward(request,response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}