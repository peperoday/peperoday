package com.peperoday.peperoday.controller;

import com.peperoday.peperoday.dto.request.BoardSaveRequestDto;
import com.peperoday.peperoday.dto.request.BoardUpdateRequestDto;
import com.peperoday.peperoday.dto.response.BoardResponseDto;
import com.peperoday.peperoday.service.BoardService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/api/board")
    public Long save(@RequestBody BoardSaveRequestDto requestDto){

        return boardService.save(requestDto);
    }

    @PutMapping("/api/board/{srno}")
    public Long update(@PathVariable Long srno, @RequestBody BoardUpdateRequestDto reqeuestDto){

        return boardService.update(srno, reqeuestDto);
    }

    @GetMapping("/api/board/{srno}")
    public BoardResponseDto findById(@PathVariable Long srno){

        return boardService.findById(srno);
    }

}
