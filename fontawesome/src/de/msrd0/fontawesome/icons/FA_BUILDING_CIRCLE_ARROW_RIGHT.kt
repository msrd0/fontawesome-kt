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

/** Building Circle-arrow-right */
object FA_BUILDING_CIRCLE_ARROW_RIGHT: Icon {
	
	override val name get() = "Building Circle-arrow-right"
	
	override val unicode get() = "e4d1"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M0 48C0 21.49 21.49 0 48 0H336C362.5 0 384 21.49 384 48V232.2C344.9 264.5 320 313.3 320 368C320 417.5 340.4 462.2 373.3 494.2C364.5 505.1 351.1 512 336 512H240V432C240 405.5 218.5 384 192 384C165.5 384 144 405.5 144 432V512H48C21.49 512 0 490.5 0 464V48zM80 224C71.16 224 64 231.2 64 240V272C64 280.8 71.16 288 80 288H112C120.8 288 128 280.8 128 272V240C128 231.2 120.8 224 112 224H80zM160 272C160 280.8 167.2 288 176 288H208C216.8 288 224 280.8 224 272V240C224 231.2 216.8 224 208 224H176C167.2 224 160 231.2 160 240V272zM272 224C263.2 224 256 231.2 256 240V272C256 280.8 263.2 288 272 288H304C312.8 288 320 280.8 320 272V240C320 231.2 312.8 224 304 224H272zM64 144C64 152.8 71.16 160 80 160H112C120.8 160 128 152.8 128 144V112C128 103.2 120.8 96 112 96H80C71.16 96 64 103.2 64 112V144zM176 96C167.2 96 160 103.2 160 112V144C160 152.8 167.2 160 176 160H208C216.8 160 224 152.8 224 144V112C224 103.2 216.8 96 208 96H176zM256 144C256 152.8 263.2 160 272 160H304C312.8 160 320 152.8 320 144V112C320 103.2 312.8 96 304 96H272C263.2 96 256 103.2 256 112V144zM640 368C640 447.5 575.5 512 496 512C416.5 512 352 447.5 352 368C352 288.5 416.5 224 496 224C575.5 224 640 288.5 640 368zM492.7 323.3L521.4 352H432C423.2 352 416 359.2 416 368C416 376.8 423.2 384 432 384H521.4L492.7 412.7C486.4 418.9 486.4 429.1 492.7 435.3C498.9 441.6 509.1 441.6 515.3 435.3L571.3 379.3C577.6 373.1 577.6 362.9 571.3 356.7L515.3 300.7C509.1 294.4 498.9 294.4 492.7 300.7C486.4 306.9 486.4 317.1 492.7 323.3V323.3z"/></svg>"""
		else -> null
	}
	
}
