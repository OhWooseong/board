package com.prjboard.domain.post;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper  {
    void save(PostRequest params); // 게시글 저장

    PostResponse findById(Long id); // 게시글 상세정보 조회

    void update(PostRequest params); // 게시글 수정

    void deleteById(Long id); // 게시글 삭제

    List<PostResponse> findAll(); // 게시글 리스트 조회

    int count(); // 게시글 수

}
