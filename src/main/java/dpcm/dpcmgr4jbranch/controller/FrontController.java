package dpcm.dpcmgr4jbranch.controller;

import dpcm.dpcmgr4jbranch.model.classes.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;

// @Annotation. oplyser spring at klassen er en controller.
@Controller
public class FrontController {

    ArrayList<Project> projectArrayList = new ArrayList<>();
    ArrayList<String> activeProjectsArray = new ArrayList<>();
    // @GetMapping tager imod en getrequest fra browseren.
    @GetMapping("/index")
    public String index()
    {
        return "index";
    }
    // index er en html fil der returneres. Og altid den html der ledes efter først!
    // login er den html fil der returneres (get).
    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

    // Hvis login er godkendt bliver vi redirectet til project_list
    @PostMapping("/submit_login")
    public String submit_login()
    {
        return "redirect:project_list";
    }

    // Skal indeholde en samlet liste over alle de projekter der er blevet arbejdet, og ikke er slettet fra DB. 'overblik'
    @GetMapping("/project_creator")
    public String project_creator()
    {
        return "project_creator";
    }
    @GetMapping("/project_update")
    public String project_update()
    {

        return "project_update";
    }
    // @PostMapping tager imod en Post-request fra browseren. åbner project_creator.
    @PostMapping("/submit_project_form")
    public String submit_project_form(@RequestParam("project_name")String projectName
            , @RequestParam("dead_line") String deadLine, @RequestParam("project_description")String projectDescription
            , @RequestParam("project_id")String projectId, @RequestParam("total_project_time")String totalProjectTime,@RequestParam("number_of_task")String numberOfTask)
    {
        Project project = new Project(projectName,deadLine,projectDescription,projectId,totalProjectTime,numberOfTask);
        projectArrayList.add(project);
        return "redirect:/project_creation_succes";
    }
        @GetMapping("/project_creation_succes")
        public String project_creation_succes(Model model)
    {
        model.addAttribute("project_details",projectArrayList.get(projectArrayList.size()-1));
        return "project_creation_succes";
    }
        // Project details skal indeholde alle fakta om aktuelt project man arbejder med.
        @GetMapping("/project_details")
        public String project_details(Model model)
        {
            model.addAttribute("detailposts",projectArrayList);
            return "project_details";
        }
    @GetMapping("/project_list")
        public String project_list(@RequestParam("project_name")String ProjectName)
    {

        activeProjectsArray.add(project_list(ProjectName));
        return "project_list";
    }

}

