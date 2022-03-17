/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_INDIAN_RUPEE_SIGN: Icon {
	
	override val name get() = "Indian Rupee Sign"
	
	override val unicode get() = "f156"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M.0003 64C.0003 46.33 14.33 32 32 32H112C191.5 32 256 96.47 256 176C256 234.8 220.8 285.3 170.3 307.7L221.7 436.1C228.3 452.5 220.3 471.1 203.9 477.7C187.5 484.3 168.9 476.3 162.3 459.9L106.3 320H64V448C64 465.7 49.67 480 32 480C14.33 480 0 465.7 0 448L.0003 64zM64 256H112C156.2 256 192 220.2 192 176C192 131.8 156.2 96 112 96H64V256zM320.8 282.2C321.3 283.3 322.2 284.8 325 287.1C332.2 292.8 343.7 297.1 362.9 303.8L364.2 304.3C380.3 309.1 402.9 317.9 419.1 332.4C429.5 340.5 437.9 351 443 364.7C448.1 378.4 449.1 393.2 446.8 408.7C442.7 436.8 426.4 457.1 403.1 469.6C381 480.7 354.9 482.1 329.9 477.6L329.7 477.5C320.4 475.8 309.2 471.8 300.5 468.6C294.4 466.3 287.9 463.7 282.7 461.6C280.2 460.6 278.1 459.8 276.4 459.1C259.9 452.7 251.8 434.2 258.2 417.7C264.6 401.2 283.1 393.1 299.6 399.5C302.2 400.5 304.8 401.5 307.5 402.6C312.3 404.5 317.4 406.5 322.9 408.6C331.7 411.9 338.2 413.1 341.6 414.6C357.2 417.5 368.3 415.5 374.5 412.4C379.4 409.9 382.5 406.3 383.5 399.3C384.5 392.4 383.7 388.8 383.1 387.1C382.4 385.4 381.3 383.5 378.6 381.2C371.7 375.4 360.4 370.8 341.6 364.2L338.6 363.1C323.1 357.7 301.6 350.2 285.3 337.2C275.8 329.7 266.1 319.7 261.5 306.3C256.1 292.8 254.9 278.2 257.2 263.1C265.6 205.1 324.2 185.1 374.1 194.2C380.1 195.5 401.4 200 409.5 202.6C426.4 207.8 435.8 225.7 430.6 242.6C425.3 259.5 407.4 268.9 390.5 263.7C385.8 262.2 368.2 258.2 362.6 257.2C347.1 254.5 336.8 256.8 329.1 260.4C323.7 263.7 321.1 267.1 320.5 272.4C319.6 278.4 320.4 281.2 320.8 282.2H320.8z"/></svg>"""
		else -> null
	}
	
}

val FA_RUPEE = FA_INDIAN_RUPEE_SIGN
