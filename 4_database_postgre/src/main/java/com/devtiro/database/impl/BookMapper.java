package com.devtiro.database.impl;

import com.devtiro.database.domain.dto.BookDto;
import com.devtiro.database.domain.entities.BookEntity;
import com.devtiro.database.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.awt.print.Book;
@Component
public class BookMapper implements Mapper<BookEntity, BookDto> {

    private ModelMapper moderMapper;
    public BookMapper(ModelMapper moderMapper) {
        this.moderMapper = moderMapper;
    }
    @Override
    public BookDto mapTo(BookEntity bookEntity) {
        return moderMapper.map(bookEntity, BookDto.class);
    }

    @Override
    public BookEntity mapFrom(BookDto bookDto) {
        return moderMapper.map(bookDto, BookEntity.class);
    }
}
