package com.bosch.io.boschgitrepos.domain.client;

import com.bosch.io.boschgitrepos.domain.client.dto.RepositoryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;
import java.util.List;

@FeignClient(name = "gitHubClient", url = "https://api.github.com")
public interface GitHubClient {

    @RequestMapping("/orgs/{orgId}/repos")
    List<RepositoryDTO> getPublicRepos(@PathVariable String orgId,
                                       @PathParam("page") Integer page,
                                       @PathParam("per_page") Integer perPage);
}
