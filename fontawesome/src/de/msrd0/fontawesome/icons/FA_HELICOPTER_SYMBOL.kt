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

object FA_HELICOPTER_SYMBOL: Icon {
	
	override val name get() = "Helicopter Symbol"
	
	override val unicode get() = "e502"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M320 66.66V1.985C435.8 16.42 527.6 108.2 542 224H477.3C463.9 143.6 400.4 80.15 320 66.66V66.66zM320 510V445.4C400.4 431.9 463.9 368.4 477.3 288H542C527.6 403.8 435.8 495.6 320 510V510zM33.98 288H98.65C112.1 368.4 175.6 431.9 256 445.4V510C140.2 495.6 48.42 403.8 33.98 288zM256 1.984V66.66C175.6 80.15 112.1 143.6 98.66 224H33.98C48.42 108.2 140.2 16.42 256 1.985V1.984zM240 224H336V160C336 142.3 350.3 128 368 128C385.7 128 400 142.3 400 160V352C400 369.7 385.7 384 368 384C350.3 384 336 369.7 336 352V288H240V352C240 369.7 225.7 384 208 384C190.3 384 176 369.7 176 352V160C176 142.3 190.3 128 208 128C225.7 128 240 142.3 240 160V224z"/></svg>"""
		else -> null
	}
	
}
