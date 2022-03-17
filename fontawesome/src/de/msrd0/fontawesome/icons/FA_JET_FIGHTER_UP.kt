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

object FA_JET_FIGHTER_UP: Icon {
	
	override val name get() = "Jet Fighter Up"
	
	override val unicode get() = "e518"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M346.8 112.6C350.2 120.6 352 129.2 352 137.9V214.8L496 298.8V280C496 266.7 506.7 256 520 256C533.3 256 544 266.7 544 280V392C544 405.3 533.3 416 520 416C506.7 416 496 405.3 496 392V384H352V416.7L410.5 467.1C414 470.1 416 475.4 416 480V496C416 504.8 408.8 512 400 512H304V448C304 439.2 296.8 432 288 432C279.2 432 272 439.2 272 448V512H176C167.2 512 160 504.8 160 496V480C160 475.4 161.1 470.1 165.5 467.1L224 416.7V384H80V392C80 405.3 69.25 416 56 416C42.75 416 32 405.3 32 392V280C32 266.7 42.75 256 56 256C69.25 256 80 266.7 80 280V298.8L224 214.8V137.9C224 129.2 225.8 120.6 229.2 112.6L273.3 9.697C275.8 3.814 281.6 0 288 0C294.4 0 300.2 3.814 302.7 9.697L346.8 112.6z"/></svg>"""
		else -> null
	}
	
}
