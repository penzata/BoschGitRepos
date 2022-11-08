package com.bosch.io.boschgitrepos.domain.client;

import com.bosch.io.boschgitrepos.domain.client.dto.RepositoryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "gitHubClient", url = "${client.post.baseUrl}")
public interface GitHubClient {

    @GetMapping("/orgs/bosch-io/repos")
    List<RepositoryDTO> getAllPublicRepos(@RequestParam("page") Integer page);
}