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

object FA_PESO_SIGN: Icon {
	
	override val name get() = "Peso Sign"
	
	override val unicode get() = "e222"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M176 32C244.4 32 303.7 71.01 332.8 128H352C369.7 128 384 142.3 384 160C384 177.7 369.7 192 352 192H351.3C351.8 197.3 352 202.6 352 208C352 213.4 351.8 218.7 351.3 224H352C369.7 224 384 238.3 384 256C384 273.7 369.7 288 352 288H332.8C303.7 344.1 244.4 384 176 384H96V448C96 465.7 81.67 480 64 480C46.33 480 32 465.7 32 448V288C14.33 288 0 273.7 0 256C0 238.3 14.33 224 32 224V192C14.33 192 0 177.7 0 160C0 142.3 14.33 128 32 128V64C32 46.33 46.33 32 64 32H176zM254.4 128C234.2 108.2 206.5 96 176 96H96V128H254.4zM96 192V224H286.9C287.6 218.8 288 213.4 288 208C288 202.6 287.6 197.2 286.9 192H96zM254.4 288H96V320H176C206.5 320 234.2 307.8 254.4 288z"/></svg>"""
		else -> null
	}
	
}
