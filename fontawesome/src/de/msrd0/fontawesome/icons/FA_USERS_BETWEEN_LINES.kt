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

/** Users Between-lines */
object FA_USERS_BETWEEN_LINES: Icon {
	
	override val name get() = "Users Between-lines"
	
	override val unicode get() = "e591"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M0 24C0 10.75 10.75 0 24 0H616C629.3 0 640 10.75 640 24C640 37.25 629.3 48 616 48H24C10.75 48 0 37.25 0 24zM0 488C0 474.7 10.75 464 24 464H616C629.3 464 640 474.7 640 488C640 501.3 629.3 512 616 512H24C10.75 512 0 501.3 0 488zM211.2 160C211.2 195.3 182.5 224 147.2 224C111.9 224 83.2 195.3 83.2 160C83.2 124.7 111.9 96 147.2 96C182.5 96 211.2 124.7 211.2 160zM32 320C32 284.7 60.65 256 96 256H192C204.2 256 215.7 259.4 225.4 265.4C188.2 280.5 159.8 312.6 149.6 352H64C46.33 352 32 337.7 32 320V320zM415.9 264.6C425.3 259.1 436.3 256 448 256H544C579.3 256 608 284.7 608 320C608 337.7 593.7 352 576 352H493.6C483.2 311.9 453.1 279.4 415.9 264.6zM391.2 290.4C423.3 297.8 449.3 321.3 460.1 352C463.7 362 465.6 372.8 465.6 384C465.6 401.7 451.3 416 433.6 416H209.6C191.9 416 177.6 401.7 177.6 384C177.6 372.8 179.5 362 183.1 352C193.6 322.3 218.3 299.2 249.1 291.1C256.1 289.1 265.1 288 273.6 288H369.6C377 288 384.3 288.8 391.2 290.4zM563.2 160C563.2 195.3 534.5 224 499.2 224C463.9 224 435.2 195.3 435.2 160C435.2 124.7 463.9 96 499.2 96C534.5 96 563.2 124.7 563.2 160zM241.6 176C241.6 131.8 277.4 96 321.6 96C365.8 96 401.6 131.8 401.6 176C401.6 220.2 365.8 256 321.6 256C277.4 256 241.6 220.2 241.6 176z"/></svg>"""
		else -> null
	}
	
}
