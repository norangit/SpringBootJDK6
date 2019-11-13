package com.jll.book;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

@Component
public interface BookRepository extends BaseRepository<Book>{

}
