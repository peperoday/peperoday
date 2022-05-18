package com.peperoday.peperoday.service;

import com.peperoday.peperoday.domain.Board;
import com.peperoday.peperoday.dto.request.BoardSaveRequestDto;
import com.peperoday.peperoday.dto.request.BoardUpdateRequestDto;
import com.peperoday.peperoday.dto.response.BoardResponseDto;
import com.peperoday.peperoday.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public Long save(BoardSaveRequestDto requestDto){
        return boardRepository.save(requestDto.toEntity()).getBoardSrno();
    }

    @Transactional
    public Long update(Long srno, BoardUpdateRequestDto requestDto){
        Board board = boardRepository.findById(srno).orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. srno="+srno));

        board.update(requestDto.getTitle(), requestDto.getContent());

        return srno;
    }

    public BoardResponseDto findById(Long srno){
        Board entity = boardRepository.findById(srno).orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. srno"+ srno));

        return new BoardResponseDto(entity);
    }
}
