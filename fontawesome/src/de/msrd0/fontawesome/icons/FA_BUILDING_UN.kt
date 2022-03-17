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

/** Building Un */
object FA_BUILDING_UN: Icon {
	
	override val name get() = "Building Un"
	
	override val unicode get() = "e4d9"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M336 0C362.5 0 384 21.49 384 48V464C384 490.5 362.5 512 336 512H240V432C240 405.5 218.5 384 192 384C165.5 384 144 405.5 144 432V512H48C21.49 512 0 490.5 0 464V48C0 21.49 21.49 0 48 0H336zM64 272C64 280.8 71.16 288 80 288H112C120.8 288 128 280.8 128 272V240C128 231.2 120.8 224 112 224H80C71.16 224 64 231.2 64 240V272zM176 224C167.2 224 160 231.2 160 240V272C160 280.8 167.2 288 176 288H208C216.8 288 224 280.8 224 272V240C224 231.2 216.8 224 208 224H176zM256 272C256 280.8 263.2 288 272 288H304C312.8 288 320 280.8 320 272V240C320 231.2 312.8 224 304 224H272C263.2 224 256 231.2 256 240V272zM237.3 71.12C233.4 65.26 226.1 62.64 219.4 64.69C212.6 66.73 208 72.95 208 80V176C208 184.8 215.2 192 224 192C232.8 192 240 184.8 240 176V132.8L274.7 184.9C278.6 190.7 285.9 193.4 292.6 191.3C299.4 189.3 304 183.1 304 176V80C304 71.16 296.8 64 288 64C279.2 64 272 71.16 272 80V123.2L237.3 71.12zM112 80C112 71.16 104.8 64 96 64C87.16 64 80 71.16 80 80V144C80 170.5 101.5 192 128 192C154.5 192 176 170.5 176 144V80C176 71.16 168.8 64 160 64C151.2 64 144 71.16 144 80V144C144 152.8 136.8 160 128 160C119.2 160 112 152.8 112 144V80z"/></svg>"""
		else -> null
	}
	
}
