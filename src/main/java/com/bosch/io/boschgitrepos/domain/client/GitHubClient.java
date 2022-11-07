package com.bosch.io.boschgitrepos.domain.client;

import com.bosch.io.boschgitrepos.domain.client.dto.RepositoryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "gitHubClient", url = "${client.post.baseUrl}")
public interface GitHubClient {

    @GetMapping("/repos")
    List<RepositoryDTO> getAllPublicRepos();
}
