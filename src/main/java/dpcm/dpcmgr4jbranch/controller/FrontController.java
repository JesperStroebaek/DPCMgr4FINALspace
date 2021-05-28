package dpcm.dpcmgr4jbranch.controller;

import dpcm.dpcmgr4jbranch.dataAccesLayer.DataFacade;
import dpcm.dpcmgr4jbranch.model.classes.Project;
import dpcm.dpcmgr4jbranch.model.classes.SubTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;


import java.util.ArrayList;


// @Annotation. oplyser spring at klassen er en controller.
@Controller
public class FrontController {

    @Autowired
    DataFacade dataFacade;
    ArrayList<Project> projectArrayList = new ArrayList<>();
    ArrayList<SubTask> subTaskArrayList = new ArrayList<>();
    //DataFacade dataFacade = new DataFacade();


    // @GetMapping tager imod en getrequest fra browseren.
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    // index er en html fil der returneres. Og altid den html der ledes efter først!
    // login er den html fil der returneres (get).
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // Hvis login er godkendt bliver vi redirectet til project_list
    @PostMapping("/submit_login")
    public String submit_login() {
        return "redirect:project_list";
    }

    // Skal indeholde en samlet liste over alle de projekter der er blevet arbejdet, og ikke er slettet fra DB. 'overblik'
    @GetMapping("/project_creator")
    public String project_creator(WebRequest request, Model model) throws Exception {


        //int projectId = dataFacade.createProject(projectName, consultantName, projectDescription, startDate, deadLine);
        //Project project = dataFacade.getProjectFromId(projectId);
        return "project_creator";
    }

    @GetMapping("/project_list")
    public String project_list(Model model) {
        model.addAttribute("projects", projectArrayList);

        return "project_list";
    }

    @PostMapping("/get_project_list")
    public String getProjectList(){


        return "redirect:project_list";
    }

    // @PostMapping tager imod en Post-request fra browseren. åbner project_creator.
    @PostMapping("/submit_project_form")
    public String submit_project_form(WebRequest request) throws Exception {
        String projectName = request.getParameter("project_name");
        String consultantName = request.getParameter("consultant_name");
        String projectDescription = request.getParameter("project_description");
        String startDate = request.getParameter("start_date");
        String deadLine = request.getParameter("dead_line");
        dataFacade.createProject(projectName, projectDescription, consultantName, startDate, deadLine);
        /*@RequestParam("consultant_name")String consultantName
        , @RequestParam("project_name")String projectName
        , @RequestParam("start_date")String startDate
        , @RequestParam("dead_line") String deadLine
        , @RequestParam("project_description")String projectDescription
        , @RequestParam("sub_task_name")String subTaskName
        , @RequestParam("sub_task_description") String subTaskDescription
        , @RequestParam("sub_task_time")String subTaskTime)*/

        Project project = new Project(projectName, consultantName, projectDescription, startDate, deadLine);
        projectArrayList.add(project);
        return "redirect:project_creation_succes";
    }

    @GetMapping("/project_creation_succes")
    public String project_creation_succes(Model model) {
        model.addAttribute("project_details", projectArrayList.get(projectArrayList.size() - 1));
        return "project_creation_succes";
    }

    // Project details skal indeholde alle fakta om aktuelt project man arbejder med.
    @GetMapping("/project_details")
    public String project_details(Model model) {
        model.addAttribute("detailposts", projectArrayList);
        return "project_details";
    }

    @GetMapping("/subtask_creator")
    public String subtask_creator(Model model) {

        return "subtask_creator";
    }


    @PostMapping("/submit_subtask_form")
    public String add_subtask_form(WebRequest webRequest, Model model) {
        String suptaskName = webRequest.getParameter("sub_task_name");
        String suptaskDesripion = webRequest.getParameter("sub_task_description");
        String suptaskTime = webRequest.getParameter("sub_task_time");
        String subtaskPrice = webRequest.getParameter("sub_task_price");
        String subtaskConsultantnName = webRequest.getParameter("sub_task_consultant_name");
        String subtaskDeadLine = webRequest.getParameter("sub_task_dead_line");


        dataFacade.createSubTask(suptaskName, suptaskDesripion, suptaskTime, subtaskPrice, subtaskConsultantnName, subtaskDeadLine);
        model.addAttribute("subtaskpost", subTaskArrayList);

        return "redirect:subtask_creation_succes";
    }
    @GetMapping("/subtask_creation_succes")
    public String subtask_creation_succes(){

        return "subtask_creation_succes";
    }



}






