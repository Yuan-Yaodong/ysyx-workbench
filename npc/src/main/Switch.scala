/*
 * Dummy file to start a Chisel project.
 *
 * Author: Martin Schoeberl (martin@jopdesign.com)
 * 
 */

package empty

import chisel3._
import chisel3.util._

class Switch extends Module {
  val io = IO(new Bundle {
    val a = Input(UInt(1.W))
    val b = Input(UInt(1.W))
    val f = Output(UInt(1.W))
  })

  io.f := io.a ^ io.b

}

object SwitchMain extends App {
  println("Generating the adder hardware")
  emitVerilog(new Switch(), Array("--target-dir", "generated"))
}