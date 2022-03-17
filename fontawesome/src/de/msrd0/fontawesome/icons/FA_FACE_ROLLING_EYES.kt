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
import de.msrd0.fontawesome.Style.REGULAR

/** Face Rolling Eyes */
object FA_FACE_ROLLING_EYES: Icon {
	
	override val name get() = "Face Rolling Eyes"
	
	override val unicode get() = "f5a5"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256zM192 368C183.2 368 176 375.2 176 384C176 392.8 183.2 400 192 400H320C328.8 400 336 392.8 336 384C336 375.2 328.8 368 320 368H192zM186.2 165.6C189.8 170.8 192 177.1 192 184C192 201.7 177.7 216 160 216C142.3 216 128 201.7 128 184C128 177.1 130.2 170.8 133.8 165.6C111.5 175.6 96 197.1 96 224C96 259.3 124.7 288 160 288C195.3 288 224 259.3 224 224C224 197.1 208.5 175.6 186.2 165.6zM352 288C387.3 288 416 259.3 416 224C416 197.1 400.5 175.6 378.2 165.6C381.8 170.8 384 177.1 384 184C384 201.7 369.7 216 352 216C334.3 216 320 201.7 320 184C320 177.1 322.2 170.8 325.8 165.6C303.5 175.6 288 197.1 288 224C288 259.3 316.7 288 352 288z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M168 376C168 362.7 178.7 352 192 352H320C333.3 352 344 362.7 344 376C344 389.3 333.3 400 320 400H192C178.7 400 168 389.3 168 376zM80 224C80 179.8 115.8 144 160 144C204.2 144 240 179.8 240 224C240 268.2 204.2 304 160 304C115.8 304 80 268.2 80 224zM160 272C186.5 272 208 250.5 208 224C208 209.7 201.7 196.8 191.8 188C191.9 189.3 192 190.6 192 192C192 209.7 177.7 224 160 224C142.3 224 128 209.7 128 192C128 190.6 128.1 189.3 128.2 188C118.3 196.8 112 209.7 112 224C112 250.5 133.5 272 160 272V272zM272 224C272 179.8 307.8 144 352 144C396.2 144 432 179.8 432 224C432 268.2 396.2 304 352 304C307.8 304 272 268.2 272 224zM352 272C378.5 272 400 250.5 400 224C400 209.7 393.7 196.8 383.8 188C383.9 189.3 384 190.6 384 192C384 209.7 369.7 224 352 224C334.3 224 320 209.7 320 192C320 190.6 320.1 189.3 320.2 188C310.3 196.8 304 209.7 304 224C304 250.5 325.5 272 352 272zM0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256zM256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_FACE_ROLLING_EYES]. */
val FA_MEH_ROLLING_EYES = FA_FACE_ROLLING_EYES
