package com.github.supercodingspring.supercodingproject1st.service.mapper;

import com.github.supercodingspring.supercodingproject1st.repository.entity.Post;
import com.github.supercodingspring.supercodingproject1st.repository.entity.User;
import com.github.supercodingspring.supercodingproject1st.web.dto.PostDto;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-27T12:54:03+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 17.0.12 (Eclipse Adoptium)"
)
public class PostMapperImpl implements PostMapper {

    @Override
    public PostDto PosttoPostDto(Post post) {
        if ( post == null ) {
            return null;
        }

        PostDto postDto = new PostDto();

        postDto.setAuthor( postUserUserName( post ) );
        postDto.setCreated_at( post.getCreatedAt() );
        postDto.setId( post.getId() );
        postDto.setTitle( post.getTitle() );
        postDto.setContent( post.getContent() );
        postDto.setLikeCount( post.getLikeCount() );

        return postDto;
    }

    private String postUserUserName(Post post) {
        if ( post == null ) {
            return null;
        }
        User user = post.getUser();
        if ( user == null ) {
            return null;
        }
        String userName = user.getUserName();
        if ( userName == null ) {
            return null;
        }
        return userName;
    }
}
