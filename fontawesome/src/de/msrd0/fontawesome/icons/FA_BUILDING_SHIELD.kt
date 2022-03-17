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

/** Building Shield */
object FA_BUILDING_SHIELD: Icon {
	
	override val name get() = "Building Shield"
	
	override val unicode get() = "e4d8"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M0 48C0 21.49 21.49 0 48 0H336C362.5 0 384 21.49 384 48V207L341.6 224H272C263.2 224 256 231.2 256 240V304C256 304.9 256.1 305.7 256.2 306.6C258.5 364.7 280.3 451.4 354.9 508.1C349.1 510.6 342.7 512 336 512H240V432C240 405.5 218.5 384 192 384C165.5 384 144 405.5 144 432V512H48C21.49 512 0 490.5 0 464V48zM80 224C71.16 224 64 231.2 64 240V272C64 280.8 71.16 288 80 288H112C120.8 288 128 280.8 128 272V240C128 231.2 120.8 224 112 224H80zM160 272C160 280.8 167.2 288 176 288H208C216.8 288 224 280.8 224 272V240C224 231.2 216.8 224 208 224H176C167.2 224 160 231.2 160 240V272zM64 144C64 152.8 71.16 160 80 160H112C120.8 160 128 152.8 128 144V112C128 103.2 120.8 96 112 96H80C71.16 96 64 103.2 64 112V144zM176 96C167.2 96 160 103.2 160 112V144C160 152.8 167.2 160 176 160H208C216.8 160 224 152.8 224 144V112C224 103.2 216.8 96 208 96H176zM256 144C256 152.8 263.2 160 272 160H304C312.8 160 320 152.8 320 144V112C320 103.2 312.8 96 304 96H272C263.2 96 256 103.2 256 112V144zM423.1 225.7C428.8 223.4 435.2 223.4 440.9 225.7L560.9 273.7C570 277.4 576 286.2 576 296C576 359.3 550.1 464.8 441.2 510.2C435.3 512.6 428.7 512.6 422.8 510.2C313.9 464.8 288 359.3 288 296C288 286.2 293.1 277.4 303.1 273.7L423.1 225.7zM432 273.8V461.7C500.2 428.7 523.5 362.7 527.4 311.1L432 273.8z"/></svg>"""
		else -> null
	}
	
}
