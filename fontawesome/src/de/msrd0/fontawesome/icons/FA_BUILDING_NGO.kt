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

/** Building Ngo */
object FA_BUILDING_NGO: Icon {
	
	override val name get() = "Building Ngo"
	
	override val unicode get() = "e4d7"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M320 112V144C320 152.8 312.8 160 304 160C295.2 160 288 152.8 288 144V112C288 103.2 295.2 96 304 96C312.8 96 320 103.2 320 112zM336 0C362.5 0 384 21.49 384 48V464C384 490.5 362.5 512 336 512H240V432C240 405.5 218.5 384 192 384C165.5 384 144 405.5 144 432V512H48C21.49 512 0 490.5 0 464V48C0 21.49 21.49 0 48 0H336zM64 272C64 280.8 71.16 288 80 288H112C120.8 288 128 280.8 128 272V240C128 231.2 120.8 224 112 224H80C71.16 224 64 231.2 64 240V272zM176 224C167.2 224 160 231.2 160 240V272C160 280.8 167.2 288 176 288H208C216.8 288 224 280.8 224 272V240C224 231.2 216.8 224 208 224H176zM256 272C256 280.8 263.2 288 272 288H304C312.8 288 320 280.8 320 272V240C320 231.2 312.8 224 304 224H272C263.2 224 256 231.2 256 240V272zM168 64C159.2 64 152 71.16 152 80V168C152 181.3 162.7 192 176 192H208C221.3 192 232 181.3 232 168V144C232 135.2 224.8 128 216 128C207.2 128 200 135.2 200 144V160H184V96H216C224.8 96 232 88.84 232 80C232 71.16 224.8 64 216 64H168zM256 144C256 170.5 277.5 192 304 192C330.5 192 352 170.5 352 144V112C352 85.49 330.5 64 304 64C277.5 64 256 85.49 256 112V144zM61.31 71.12C57.4 65.26 50.11 62.64 43.36 64.69C36.62 66.73 32 72.95 32 80V176C32 184.8 39.16 192 48 192C56.84 192 64 184.8 64 176V132.8L98.69 184.9C102.6 190.7 109.9 193.4 116.6 191.3C123.4 189.3 128 183.1 128 176V80C128 71.16 120.8 64 112 64C103.2 64 96 71.16 96 80V123.2L61.31 71.12z"/></svg>"""
		else -> null
	}
	
}
