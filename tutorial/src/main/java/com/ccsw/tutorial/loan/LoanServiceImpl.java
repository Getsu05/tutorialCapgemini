package com.ccsw.tutorial.loan;

import com.ccsw.tutorial.loan.model.Loan;
import com.ccsw.tutorial.loan.model.LoanDto;
import com.ccsw.tutorial.loan.model.LoanSearchDto;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ccsw
 *
 */
@Service
@Transactional
public class LoanServiceImpl implements LoanService {

    @Override
    public Loan get(Long id) {
        return null;
    }

    @Override
    public Page<Loan> findPage(LoanSearchDto dto) {
        return null;
    }

    @Override
    public void save(Long id, LoanDto dto) {

    }

    @Override
    public void delete(Long id) throws Exception {

    }

    @Override
    public List<Loan> findAll() {
        return List.of();
    }
}
