package com.openbankproject.adapter.akka.springboot.main

import com.openbankproject.adapter.akka.springboot.main.service.RestService
import javax.annotation.Resource
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(classOf[SpringRunner])
@SpringBootTest
class BankServiceTests {

  @Resource
  val bankService: RestService = null

  @Test
  def getBanksTest = {
//    val account = this.bankService.getCoreBankAccount("bankId", "accountId")
//    println(account)
  }
}
