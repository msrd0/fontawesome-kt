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

/** File Shield */
object FA_FILE_SHIELD: Icon {
	
	override val name get() = "File Shield"
	
	override val unicode get() = "e4f0"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M0 64C0 28.65 28.65 0 64 0H224V128C224 145.7 238.3 160 256 160H384V207L291.2 244.2C269.9 252.7 256 273.3 256 296.2C256 352.7 274.9 444.2 350.2 504.4C341.2 509.3 330.9 512 320 512H64C28.65 512 0 483.3 0 448V64zM256 128V0L384 128H256zM423.1 225.7C428.8 223.4 435.2 223.4 440.9 225.7L560.9 273.7C570 277.4 576 286.2 576 296C576 359.3 550.1 464.8 441.2 510.2C435.3 512.6 428.7 512.6 422.8 510.2C313.9 464.8 288 359.3 288 296C288 286.2 293.1 277.4 303.1 273.7L423.1 225.7zM432 273.8V461.7C500.2 428.7 523.5 362.7 527.4 311.1L432 273.8z"/></svg>"""
		else -> null
	}
	
}
