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

/** Users Rectangle */
object FA_USERS_RECTANGLE: Icon {
	
	override val name get() = "Users Rectangle"
	
	override val unicode get() = "e594"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M223.8 176C223.8 202.5 202.3 224 175.8 224C149.3 224 127.8 202.5 127.8 176C127.8 149.5 149.3 128 175.8 128C202.3 128 223.8 149.5 223.8 176zM96 309.3C96 279.9 119.9 256 149.3 256H218.7C227.8 256 236.5 258.3 244 262.4C211.6 274.3 186.8 301.9 178.8 336H122.7C107.9 336 96 324.1 96 309.3H96zM395.1 262.4C403.5 258.3 412.2 256 421.3 256H490.7C520.1 256 544 279.9 544 309.3C544 324.1 532.1 336 517.3 336H461.2C453.2 301.9 428.4 274.3 395.1 262.4H395.1zM372 288.1C398 293.4 419.3 311.7 427.9 336C430.6 343.5 432 351.6 432 360C432 373.3 421.3 384 408 384H232C218.7 384 208 373.3 208 360C208 351.6 209.4 343.5 212.1 336C220.7 311.7 241.1 293.4 267.1 288.1C271.9 288.3 275.9 288 280 288H360C364.1 288 368.1 288.3 372 288.1V288.1zM512 176C512 202.5 490.5 224 464 224C437.5 224 416 202.5 416 176C416 149.5 437.5 128 464 128C490.5 128 512 149.5 512 176zM256 192C256 156.7 284.7 128 320 128C355.3 128 384 156.7 384 192C384 227.3 355.3 256 320 256C284.7 256 256 227.3 256 192zM544 0C597 0 640 42.98 640 96V416C640 469 597 512 544 512H96C42.98 512 0 469 0 416V96C0 42.98 42.98 0 96 0H544zM64 416C64 433.7 78.33 448 96 448H544C561.7 448 576 433.7 576 416V96C576 78.33 561.7 64 544 64H96C78.33 64 64 78.33 64 96V416z"/></svg>"""
		else -> null
	}
	
}
