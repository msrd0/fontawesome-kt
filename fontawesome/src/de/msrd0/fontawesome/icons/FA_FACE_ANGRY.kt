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

/** Face angry */
object FA_FACE_ANGRY: Icon {
	
	override val name get() = "Face angry"
	
	override val unicode get() = "f556"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM339.9 373.3C323.8 355.4 295.7 336 256 336C216.3 336 188.2 355.4 172.1 373.3C166.2 379.9 166.7 389.1 173.3 395.9C179.9 401.8 189.1 401.3 195.9 394.7C207.6 381.7 227.5 368 255.1 368C284.5 368 304.4 381.7 316.1 394.7C322 401.3 332.1 401.8 338.7 395.9C345.3 389.1 345.8 379.9 339.9 373.3H339.9zM176.4 272C194 272 208.4 257.7 208.4 240C208.4 238.5 208.3 237 208.1 235.6L218.9 239.2C227.3 241.1 236.4 237.4 239.2 229.1C241.1 220.7 237.4 211.6 229.1 208.8L133.1 176.8C124.7 174 115.6 178.6 112.8 186.9C110 195.3 114.6 204.4 122.9 207.2L153.7 217.4C147.9 223.2 144.4 231.2 144.4 240C144.4 257.7 158.7 272 176.4 272zM358.9 217.2L389.1 207.2C397.4 204.4 401.1 195.3 399.2 186.9C396.4 178.6 387.3 174 378.9 176.8L282.9 208.8C274.6 211.6 270 220.7 272.8 229.1C275.6 237.4 284.7 241.1 293.1 239.2L304.7 235.3C304.5 236.8 304.4 238.4 304.4 240C304.4 257.7 318.7 272 336.4 272C354 272 368.4 257.7 368.4 240C368.4 231.1 364.7 223 358.9 217.2H358.9z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M328.4 393.5C318.7 402.6 303.5 402.1 294.5 392.4C287.1 384.5 274.4 376 256 376C237.6 376 224.9 384.5 217.5 392.4C208.5 402.1 193.3 402.6 183.6 393.5C173.9 384.5 173.4 369.3 182.5 359.6C196.7 344.3 221.4 328 256 328C290.6 328 315.3 344.3 329.5 359.6C338.6 369.3 338.1 384.5 328.4 393.5zM144.4 240C144.4 231.2 147.9 223.2 153.7 217.4L122.9 207.2C114.6 204.4 110 195.3 112.8 186.9C115.6 178.6 124.7 174 133.1 176.8L229.1 208.8C237.4 211.6 241.1 220.7 239.2 229.1C236.4 237.4 227.3 241.1 218.9 239.2L208.1 235.6C208.3 237 208.4 238.5 208.4 240C208.4 257.7 194 272 176.4 272C158.7 272 144.4 257.7 144.4 240V240zM368.4 240C368.4 257.7 354 272 336.4 272C318.7 272 304.4 257.7 304.4 240C304.4 238.4 304.5 236.8 304.7 235.3L293.1 239.2C284.7 241.1 275.6 237.4 272.8 229.1C270 220.7 274.6 211.6 282.9 208.8L378.9 176.8C387.3 174 396.4 178.6 399.2 186.9C401.1 195.3 397.4 204.4 389.1 207.2L358.9 217.2C364.7 223 368.4 231.1 368.4 240H368.4zM0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256zM256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_FACE_ANGRY]. */
val FA_ANGRY = FA_FACE_ANGRY
