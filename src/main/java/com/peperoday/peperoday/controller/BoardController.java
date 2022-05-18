package com.peperoday.peperoday.controller;

import com.peperoday.peperoday.dto.request.BoardSaveRequestDto;
import com.peperoday.peperoday.dto.request.BoardUpdateRequestDto;
import com.peperoday.peperoday.dto.response.BoardResponseDto;
import com.peperoday.peperoday.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/api/v1/board")
    public Long save(@RequestBody BoardSaveRequestDto requestDto){

        return boardService.save(requestDto);
    }

    @PutMapping("/api/v1/board/{srno}")
    public Long update(@PathVariable Long srno, @RequestBody BoardUpdateRequestDto reqeuestDto){

        return boardService.update(srno, reqeuestDto);
    }

    @GetMapping("/api/v1/board/{srno}")
    public BoardResponseDto findById(@PathVariable Long srno){

        return boardService.findById(srno);
    }
}
