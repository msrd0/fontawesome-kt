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

/** Ban smoking */
object FA_BAN_SMOKING: Icon {
	
	override val name get() = "Ban smoking"
	
	override val unicode get() = "f54d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M96 304C96 312.8 103.3 320 112 320h117.5l-96-96H112C103.3 224 96 231.3 96 240V304zM256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM256 448c-105.9 0-192-86.13-192-192c0-41.38 13.25-79.75 35.75-111.1l267.4 267.4C335.8 434.8 297.4 448 256 448zM301.2 256H384v32h-50.81L301.2 256zM412.3 367.1L365.2 320H400c8.75 0 16-7.25 16-16v-64C416 231.3 408.8 224 400 224h-130.8L144.9 99.75C176.3 77.25 214.6 64 256 64C361.9 64 448 150.1 448 256C448 297.4 434.8 335.8 412.3 367.1zM320.6 128C305 128 292 116.8 289.3 102.1C288.5 98.5 285.3 96 281.5 96h-16.25c-5 0-8.625 4.5-8 9.375C261.9 136.3 288.5 160 320.6 160C336.3 160 349.3 171.3 352 185.9C352.8 189.5 356 192 359.8 192h16.17c5 0 8.708-4.5 7.958-9.375C379.3 151.7 352.8 128 320.6 128z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_BAN_SMOKING]. */
val FA_SMOKING_BAN = FA_BAN_SMOKING
